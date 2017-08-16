package selecao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.pgrl.reader.api.csv.dao.ICSVFilter;
import br.pgrl.reader.api.csv.dao.IDaoCSV;
import br.pgrl.reader.exceptions.DataQueryException;
import br.pgrl.reader.impl.csv.dao.CSVFilter;

public class CSVFilterTest {
	@Mock
	private IDaoCSV daoCSV;

	private ICSVFilter icsvFilter;

	@Before
	public void init() throws DataQueryException {
		MockitoAnnotations.initMocks(this);
		Mockito.when(daoCSV.getHeader()).thenReturn("id,uf,city");
		Mockito.when(daoCSV.getSeparator()).thenReturn(",");
		List<String> lines = new ArrayList<String>();
		lines.add("id,uf,city");
		lines.add("01,AM,Manaus");
		lines.add("02,PA,Bel�m");
		lines.add("03,SP,Araraquara");
		lines.add("04,SC,Brusque");
		lines.add("05,AM,Parintins");
		lines.add("06,SC,Florianopolis");
		Mockito.when(daoCSV.getLines()).thenReturn(lines);
		icsvFilter = new CSVFilter(daoCSV);

	}

	@Test
	public void filterTest() throws DataQueryException {
		List<String> results = icsvFilter.filter("uf", "AM");

		assertEquals(2, results.size());
		List<String> expecteds = new ArrayList<String>();
		expecteds.add("01,AM,Manaus");
		expecteds.add("05,AM,Parintins");
		for (String expected : expecteds) {
			assertTrue(results.contains(expected));
		}

	}
}

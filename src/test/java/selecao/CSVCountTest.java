package selecao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.pgrl.reader.api.csv.dao.ICSVCount;
import br.pgrl.reader.api.csv.dao.IDaoCSV;
import br.pgrl.reader.exceptions.DataQueryException;
import br.pgrl.reader.impl.csv.dao.CSVCount;

public class CSVCountTest {
	@Mock
	private IDaoCSV daoCSV;

	private ICSVCount icsvCount;

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

		Mockito.when(daoCSV.getLines()).thenReturn(lines);

		icsvCount = new CSVCount(daoCSV);

	}

	@Test
	public void countTest() throws DataQueryException {

		assertEquals(4, icsvCount.count());

	}
}

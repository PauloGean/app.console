package selecao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import app.console.dao.CSVCountDistinct;
import app.console.dao.interfaces.ICSVCountDistinct;
import app.console.dao.interfaces.IDaoCSV;
import app.console.exceptions.ReaderFileException;

public class CSVCountDistinctTest {
	@Mock
	private IDaoCSV daoCSV;

	private ICSVCountDistinct icsvCountDistinct;

	@Before
	public void init() throws ReaderFileException {
		MockitoAnnotations.initMocks(this);
		Mockito.when(daoCSV.getHeader()).thenReturn("id,uf,city");
		Mockito.when(daoCSV.getSeparator()).thenReturn(",");
		List<String> lines = new ArrayList<String>();
		lines.add("id,uf,city");
		lines.add("01,AM,Manaus");
		lines.add("02,PA,Belém");
		lines.add("03,SP,Araraquara");
		lines.add("04,SC,Brusque");
		lines.add("05,AM,Parintins");
		lines.add("06,SC,Florianopolis");
		Mockito.when(daoCSV.getLines()).thenReturn(lines);
		icsvCountDistinct = new CSVCountDistinct(daoCSV);

	}

	@Test
	public void countDistinctTest() throws ReaderFileException {

		assertEquals(4, icsvCountDistinct.countDistinct("uf"));
		assertEquals(6, icsvCountDistinct.countDistinct("id"));
		assertEquals(6, icsvCountDistinct.countDistinct("city"));

	}
}

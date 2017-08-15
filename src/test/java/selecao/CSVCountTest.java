package selecao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import app.involves.dao.CSVCount;
import app.involves.dao.interfaces.ICSVCount;
import app.involves.dao.interfaces.IDaoCSV;
import app.involves.exceptions.ReaderFileException;

public class CSVCountTest {
	@Mock
	private IDaoCSV daoCSV;

	private ICSVCount icsvCount;

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

		Mockito.when(daoCSV.getLines()).thenReturn(lines);

		icsvCount = new CSVCount(daoCSV);

	}

	@Test
	public void countTest() throws ReaderFileException {

		assertEquals(4, icsvCount.count());

	}
}

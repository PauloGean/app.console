package selecao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.involves.api.csv.dao.ICSVReader;
import br.involves.api.csv.dao.IDaoCSV;
import br.involves.exceptions.DataQueryException;
import br.involves.impl.csv.dao.CSVReader;

public class CSVReaderTest {
	@Mock
	private IDaoCSV daoCSV;

	private ICSVReader reader;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		Mockito.when(daoCSV.getDirectory()).thenReturn(new File("../selecao/src/test/resources/cidades/cidades.csv"));
		reader = new CSVReader(daoCSV);

	}

	@Test
	public void getLinesTest()  throws DataQueryException  {

		List<String> lines = reader.getLines();
		assertEquals(11, lines.size());
		boolean contains = lines.contains(
				"1100106,RO,Guajará-Mirim,,-65.3239518197,-10.7738837407,Guajara-Mirim,,Guajará-Mirim,Madeira-Guaporé");
		assertTrue(contains);
	}

	@Test(expected = DataQueryException.class)
	public void getLinesTestNotFoundFile() throws DataQueryException  {
		Mockito.when(daoCSV.getDirectory()).thenReturn(new File("../selecao/src/test/resources/cidades/notfile.csv"));

		List<String> lines = reader.getLines();

	}
}

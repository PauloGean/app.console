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

import app.involves.api.csv.dao.ICSVReader;
import app.involves.api.csv.dao.IDaoCSV;
import app.involves.exceptions.ConsultDatesException;
import app.involves.impl.csv.dao.CSVReader;

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
	public void getLinesTest()  throws ConsultDatesException  {

		List<String> lines = reader.getLines();
		assertEquals(11, lines.size());
		boolean contains = lines.contains(
				"1100106,RO,Guajar�-Mirim,,-65.3239518197,-10.7738837407,Guajara-Mirim,,Guajar�-Mirim,Madeira-Guapor�");
		assertTrue(contains);
	}

	@Test(expected = ConsultDatesException.class)
	public void getLinesTestNotFoundFile() throws ConsultDatesException  {
		Mockito.when(daoCSV.getDirectory()).thenReturn(new File("../selecao/src/test/resources/cidades/notfile.csv"));

		List<String> lines = reader.getLines();

	}
}

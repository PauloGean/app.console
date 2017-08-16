package selecao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import app.involves.api.csv.dao.ICSVCount;
import app.involves.api.csv.dao.IDaoCSV;
import app.involves.exceptions.ConsultDatesException;
import app.involves.impl.csv.dao.CSVCount;

public class CSVCountTest {
	@Mock
	private IDaoCSV daoCSV;

	private ICSVCount icsvCount;

	@Before
	public void init() throws ConsultDatesException {
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
	public void countTest() throws ConsultDatesException {

		assertEquals(4, icsvCount.count());

	}
}

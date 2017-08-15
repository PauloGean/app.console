package selecao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import app.involves.csv.dao.CSVColumn;
import app.involves.dao.interfaces.ICSVColumn;
import app.involves.dao.interfaces.IDaoCSV;

public class CSVColumnTest {
	@Mock
	private IDaoCSV daoCSV;
	
	private ICSVColumn csvColumn;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		Mockito.when(daoCSV.getHeader()).thenReturn("id,name,city");
		Mockito.when(daoCSV.getSeparator()).thenReturn(",");
		csvColumn=new CSVColumn(daoCSV);

	}

	@Test
	public void getIndexColumnTest() {
		assertEquals(0, csvColumn.getIndexColumn("id"));
		assertEquals(1, csvColumn.getIndexColumn("name"));
		assertEquals(2, csvColumn.getIndexColumn("city"));
		assertEquals(-1, csvColumn.getIndexColumn("other"));

	}
}

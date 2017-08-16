package selecao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.pgrl.reader.api.csv.dao.ICSVColumn;
import br.pgrl.reader.api.csv.dao.IDaoCSV;
import br.pgrl.reader.impl.csv.dao.CSVColumn;

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

package selecao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.console.dao.CSVDao;
import app.console.dao.CityDao;

public class CityDaoTest {
	@Test
	public void getIndexColumnTest() {
		CSVDao city=new CityDao();
		assertEquals(0, city.getIndexColumn("ibge_id"));
		assertEquals(1, city.getIndexColumn("uf"));
		assertEquals(2, city.getIndexColumn("name"));
		assertEquals(3, city.getIndexColumn("capital"));
		assertEquals(4, city.getIndexColumn("lon"));
		assertEquals(5, city.getIndexColumn("lat"));
		assertEquals(6, city.getIndexColumn("no_accents"));
		assertEquals(7, city.getIndexColumn("alternative_names"));
		assertEquals(8, city.getIndexColumn("microregion"));
		assertEquals(9, city.getIndexColumn("mesoregion"));
		assertEquals(-1, city.getIndexColumn("other"));

	}
}

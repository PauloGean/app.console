package selecao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.File;

import org.junit.Test;
import org.mockito.MockSettings;
import org.mockito.Mockito;

import app.console.dao.CityDao;
import app.console.exceptions.ReaderFileException;

public class CityDaoTest {
	
	@Test
	public void headerAndFileTest() {
		CityDao cityDao=new CityDao();
		assertEquals("ibge_id,uf,name,capital,lon,lat,no_accents,alternative_names,microregion,mesoregion",cityDao.getHeader());
		assertEquals(",",cityDao.getSeparator());
		assertTrue(cityDao.getDirectory().exists());


	}
	@Test
	public void countTest() throws ReaderFileException {
		CityDao cityDao = mock(CityDao.class,Mockito.CALLS_REAL_METHODS);
		Mockito.when(cityDao.getDirectory()).thenReturn(new File("../selecao/src/test/resources/cidades/cidades.csv"));
		assertEquals(10, cityDao.count());
	}
	@Test
	public void countDistinctTest() throws ReaderFileException {
		CityDao cityDao = mock(CityDao.class,Mockito.CALLS_REAL_METHODS);
		Mockito.when(cityDao.getDirectory()).thenReturn(new File("../selecao/src/test/resources/cidades/cidades.csv"));
		assertEquals(1, cityDao.countDistinct("uf"));
		assertEquals(10, cityDao.countDistinct("name"));
	}
	
	@Test
	public void filterTest() throws ReaderFileException {
		CityDao cityDao = mock(CityDao.class,Mockito.CALLS_REAL_METHODS);
		Mockito.when(cityDao.getDirectory()).thenReturn(new File("../selecao/src/test/resources/cidades/cidades.csv"));
		assertEquals(10, cityDao.filter("uf", "RO").size());
		assertEquals(1, cityDao.filter("name", "Cabixi").size());
	}
}

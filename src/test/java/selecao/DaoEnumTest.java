package selecao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.console.dao.CityDao;
import app.console.model.DaoEnum;

public class DaoEnumTest {
	@Test
	public void daoEnumTest() {
		
	assertTrue(CityDao.class.isInstance(DaoEnum.CITY.getDao()));	
	}
}

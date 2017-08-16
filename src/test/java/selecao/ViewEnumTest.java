package selecao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.involves.impl.controller.CityController;
import app.involves.model.enums.ControllersEnum;

public class ViewEnumTest {
	@Test
	public void daoEnumTest() {
		
	assertTrue(CityController.class.isInstance(ControllersEnum.CITY.getController()));	
	}
}

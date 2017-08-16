package selecao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.involves.enums.ViewsEnum;
import app.involves.impl.controller.CityController;

public class ViewEnumTest {
	@Test
	public void daoEnumTest() {
		
	assertTrue(CityController.class.isInstance(ViewsEnum.CITY.getController()));	
	}
}

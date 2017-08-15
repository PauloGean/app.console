package selecao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.involves.model.ViewsEnum;
import app.involves.view.CityView;

public class ViewEnumTest {
	@Test
	public void daoEnumTest() {
		
	assertTrue(CityView.class.isInstance(ViewsEnum.CITY.getView()));	
	}
}

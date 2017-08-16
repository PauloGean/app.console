package br.involves.impl.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.pgrl.reader.impl.cmd.controller.CommandWait;
import br.pgrl.reader.impl.controller.CityController;
import br.pgrl.reader.impl.dao.CityDao;
import br.pgrl.reader.impl.view.CityView;
import br.pgrl.reader.impl.view.Console;

public class CityControllerTest {
	@Mock
	CommandWait comandWait;
	@Mock
	CityController cityController;
	
	@Mock
	Console console;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		Mockito.when(cityController.getView()).thenCallRealMethod();
		Mockito.when(cityController.getDao()).thenCallRealMethod();
	


	}

	@Test
	public void instanceTest() {
		cityController=new  CityController();
		assertTrue(CityView.class.isInstance(cityController.getView()));
		assertTrue(CityDao.class.isInstance(cityController.getDao()));
	}
}

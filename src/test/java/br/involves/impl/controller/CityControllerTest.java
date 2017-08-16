package br.involves.impl.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.involves.impl.cmd.controller.ComandWait;
import br.involves.impl.dao.CityDao;
import br.involves.impl.view.CityView;
import br.involves.impl.view.Console;

public class CityControllerTest {
	@Mock
	ComandWait comandWait;
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
		assertTrue(CityView.class.isInstance(cityController.getView()));
		assertTrue(CityDao.class.isInstance(cityController.getDao()));
	}
}

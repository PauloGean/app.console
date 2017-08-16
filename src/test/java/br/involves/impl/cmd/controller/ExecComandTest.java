package br.involves.impl.cmd.controller;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.Mockito;

import br.involves.cmd.enums.ComandsEnum;
import br.involves.impl.dao.CityDao;
import br.involves.impl.view.CityView;

public class ExecComandTest {
	@Test
	public void executeTest() {
		CityDao cityDao = mock(CityDao.class, Mockito.CALLS_REAL_METHODS);
		Mockito.when(cityDao.getDirectory()).thenReturn("cidades.csv");
		new ExecComand().execute(new CityView(), cityDao, "count *", ComandsEnum.COUNT);
		new ExecComand().execute(new CityView(), cityDao, "filter capital true", ComandsEnum.FILTER);
		new ExecComand().execute(new CityView(), cityDao, "count distinct capital", ComandsEnum.COUNT);

	}
	
	@Test
	public void executeTestNoQuery() {
		CityDao cityDao = mock(CityDao.class, Mockito.CALLS_REAL_METHODS);
		Mockito.when(cityDao.getDirectory()).thenReturn("acidades.csv");
		new ExecComand().execute(new CityView(), cityDao, "count filter", ComandsEnum.COUNT);
	}
}

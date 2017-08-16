package br.involves.impl.cmd.controller;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.Mockito;

import br.pgrl.reader.cmd.enums.CommandsEnum;
import br.pgrl.reader.impl.cmd.controller.ExecComand;
import br.pgrl.reader.impl.dao.CityDao;
import br.pgrl.reader.impl.view.CityView;

public class ExecComandTest {
	@Test
	public void executeTest() {
		CityDao cityDao = mock(CityDao.class, Mockito.CALLS_REAL_METHODS);
		Mockito.when(cityDao.getDirectory()).thenReturn("cidades.csv");
		new ExecComand().execute(new CityView(), cityDao, "count *", CommandsEnum.COUNT);
		new ExecComand().execute(new CityView(), cityDao, "filter capital true", CommandsEnum.FILTER);
		new ExecComand().execute(new CityView(), cityDao, "count distinct capital", CommandsEnum.COUNT);

	}
	
	@Test
	public void executeTestNoQuery() {
		CityDao cityDao = mock(CityDao.class, Mockito.CALLS_REAL_METHODS);
		Mockito.when(cityDao.getDirectory()).thenReturn("acidades.csv");
		new ExecComand().execute(new CityView(), cityDao, "count filter", CommandsEnum.COUNT);
	}
}

package br.involves.impl.cmd.controller;

import br.involves.api.cmd.controller.IComand;
import br.involves.api.dao.IDao;
import br.involves.api.view.IViewIO;
import br.involves.exceptions.DataQueryException;

public class CountDistinct implements IComand {
	private static final String TOTAL_DE_REGISTRO_DISTINTOS = "Total de Registro Distintos:%s";
	
	@Override
	public void exec(String comand,IViewIO iView,IDao dao) throws DataQueryException {
		String field=comand.split(" ")[2];
		iView.write(String.format(TOTAL_DE_REGISTRO_DISTINTOS, dao.countDistinct(field)));
	}

}

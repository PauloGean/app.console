package br.involves.impl.cmd.controller;

import br.involves.api.cmd.controller.IComand;
import br.involves.api.dao.IDao;
import br.involves.api.view.IViewIO;
import br.involves.exceptions.DataQueryException;

public class Count implements IComand {
	private static final String TOTAL_DE_REGISTROS = "Total de Registros:%s";
	
	@Override
	public void exec(String args,IViewIO iView,IDao dao) throws DataQueryException {
		iView.write(String.format(TOTAL_DE_REGISTROS, dao.count()));
	}

}

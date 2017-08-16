package br.involves.impl.cmd.controller;

import br.involves.api.cmd.controller.IComand;
import br.involves.api.dao.IDao;
import br.involves.api.view.IView;
import br.involves.exceptions.DataQueryException;

public class Count implements IComand {
	private static final String TOTAL_DE_REGISTROS = "Total de Registros:%s";
	
	@Override
	public void exec(String args,IView iView,IDao dao) throws DataQueryException {
		iView.show(String.format(TOTAL_DE_REGISTROS, dao.count()));
	}

}
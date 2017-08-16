package app.involves.imp.cmd.controller;

import app.involves.api.dao.IDao;
import app.involves.api.view.IViewIO;
import app.involves.exceptions.ConsultDatesException;
import app.involves.impl.controller.IComand;

public class Count implements IComand {
	private static final String TOTAL_DE_REGISTROS = "Total de Registros:%s";
	
	@Override
	public void exec(String args,IViewIO iView,IDao dao) throws ConsultDatesException {
		iView.write(String.format(TOTAL_DE_REGISTROS, dao.count()));
	}

}

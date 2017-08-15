package app.involves.cmd.controller;

import app.involves.controller.IComand;
import app.involves.dao.interfaces.IDao;
import app.involves.exceptions.ConsultDatesException;
import app.involves.view.interfaces.IView;

public class Count implements IComand {
	private static final String TOTAL_DE_REGISTROS = "Total de Registros:%s";
	
	@Override
	public void exec(String args,IView iView,IDao dao) throws ConsultDatesException {
		iView.write(String.format(TOTAL_DE_REGISTROS, dao.count()));
	}

}

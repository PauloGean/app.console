package app.involves.imp.cmd.controller;

import app.involves.api.dao.IDao;
import app.involves.api.view.IViewIO;
import app.involves.exceptions.ConsultDatesException;
import app.involves.impl.controller.IComand;

public class CountDistinct implements IComand {
	private static final String TOTAL_DE_REGISTRO_DISTINTOS = "Total de Registro Distintos:%s";
	
	@Override
	public void exec(String comand,IViewIO iView,IDao dao) throws ConsultDatesException {
		String field=comand.split(" ")[2];
		iView.write(String.format(TOTAL_DE_REGISTRO_DISTINTOS, dao.countDistinct(field)));
	}

}

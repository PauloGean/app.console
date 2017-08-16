package app.involves.impl.cmd.controller;

import app.involves.api.cmd.controller.IComand;
import app.involves.api.dao.IDao;
import app.involves.api.view.IViewIO;
import app.involves.exceptions.ConsultDatesException;

public class CountDistinct implements IComand {
	private static final String TOTAL_DE_REGISTRO_DISTINTOS = "Total de Registro Distintos:%s";
	
	@Override
	public void exec(String comand,IViewIO iView,IDao dao) throws ConsultDatesException {
		String field=comand.split(" ")[2];
		iView.write(String.format(TOTAL_DE_REGISTRO_DISTINTOS, dao.countDistinct(field)));
	}

}

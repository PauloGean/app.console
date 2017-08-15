package app.involves.cmd.controller;

import app.involves.controller.IComand;
import app.involves.dao.interfaces.IDao;
import app.involves.exceptions.ConsultDatesException;
import app.involves.view.interfaces.IView;

public class CountDistinct implements IComand {
	private static final String TOTAL_DE_REGISTRO_DISTINTOS = "Total de Registro Distintos:%s";
	
	@Override
	public void exec(String comand,IView iView,IDao dao) throws ConsultDatesException {
		String field=comand.split(" ")[2];
		iView.write(String.format(TOTAL_DE_REGISTRO_DISTINTOS, dao.countDistinct(field)));
	}

}

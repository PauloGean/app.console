package app.console.cmd.controller;

import app.console.controller.IComand;
import app.console.dao.CSVDao;
import app.console.dao.IDao;

public class Count implements IComand {
	private static final String TOTAL_DE_REGISTROS = "Total de Registros:%s";
	
	@Override
	public void exec(String args,IDao dao) {
		System.out.println(String.format(TOTAL_DE_REGISTROS, dao.count()));
	}

}

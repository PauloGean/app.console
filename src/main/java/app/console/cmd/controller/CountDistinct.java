package app.console.cmd.controller;

import app.console.controller.IComand;
import app.console.dao.IDao;

public class CountDistinct implements IComand {
	private static final String TOTAL_DE_REGISTRO_DISTINTOS = "Total de Registro Distintos:%s";
	
	@Override
	public void exec(String comand,IDao dao) {
		String field=comand.split(" ")[2];
		System.out.println(String.format(TOTAL_DE_REGISTRO_DISTINTOS, dao.countDistinct(field)));
	}

}

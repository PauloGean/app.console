package app.console.cmd.controller;

import java.util.List;

import app.console.controller.IComand;
import app.console.dao.IDao;

public class Filter implements IComand {
	@Override
	public void exec(String comand,IDao dao) {
		String[] comands=comand.split(" ");
		String field=comands[1];
		String value=comands[2];
		List<String> list=dao.filter(field, value);
		System.out.println(dao.getHeader());
		for (String line : list) {
			System.out.println(line);
		}	
	}

}

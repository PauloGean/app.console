package app.console.cmd.controller;

import java.util.List;

import app.console.controller.IComand;
import app.console.dao.interfaces.IDao;
import app.console.exceptions.ReaderFileException;

public class Filter implements IComand {
	@Override
	public void exec(String comand,IDao dao) throws ReaderFileException {
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

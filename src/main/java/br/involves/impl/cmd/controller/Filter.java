package br.involves.impl.cmd.controller;

import java.util.List;

import br.involves.api.cmd.controller.IComand;
import br.involves.api.dao.IDao;
import br.involves.api.view.IViewIO;
import br.involves.exceptions.DataQueryException;

public class Filter implements IComand {
	@Override
	public void exec(String comand,IViewIO iView,IDao dao) throws DataQueryException {
		String[] comands=comand.split(" ");
		String field=comands[1];
		String value=comands[2];
		List<String> list=dao.filter(field, value);
		iView.write(dao.getHeader());
		for (String line : list) {
			iView.write(line);
		}	
	}

}

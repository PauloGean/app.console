package br.involves.impl.cmd.controller;

import java.util.List;

import br.involves.api.cmd.controller.ICommand;
import br.involves.api.dao.IDao;
import br.involves.api.view.IView;
import br.involves.exceptions.DataQueryException;

public class Filter implements ICommand {
	@Override
	public void exec(String comand,IView iView,IDao dao) throws DataQueryException {
		String[] comands=comand.split(" ");
		String field=comands[1];
		String value=comands[2];
		List<String> list=dao.filter(field, value);
		iView.show(dao.getHeader());
		for (String line : list) {
			iView.show(line);
		}	
	}

}

package app.involves.imp.cmd.controller;

import java.util.List;

import app.involves.api.dao.IDao;
import app.involves.api.view.IViewIO;
import app.involves.exceptions.ConsultDatesException;
import app.involves.impl.controller.IComand;

public class Filter implements IComand {
	@Override
	public void exec(String comand,IViewIO iView,IDao dao) throws ConsultDatesException {
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

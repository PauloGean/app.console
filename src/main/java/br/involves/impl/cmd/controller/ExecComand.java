package br.involves.impl.cmd.controller;

import br.involves.api.dao.IDao;
import br.involves.api.view.IView;
import br.involves.cmd.enums.ComandsEnum;
import br.involves.exceptions.DataQueryException;

public class ExecComand {
	public void execute(IView view, IDao dao, String input, ComandsEnum comandEnum) {
		try {
			comandEnum.getiComand().exec(input, view, dao);
		} catch (DataQueryException e) {
			view.show(e.getMessage());
		}
	}
}

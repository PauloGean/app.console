package br.pgrl.reader.impl.cmd.controller;

import br.pgrl.reader.api.dao.IDao;
import br.pgrl.reader.api.view.IView;
import br.pgrl.reader.cmd.enums.CommandsEnum;
import br.pgrl.reader.exceptions.DataQueryException;

public class ExecComand {
	public void execute(IView view, IDao dao, String input, CommandsEnum comandEnum) {
		try {
			comandEnum.getiComand().exec(input, view, dao);
		} catch (DataQueryException e) {
			view.show(e.getMessage());
		}
	}
}

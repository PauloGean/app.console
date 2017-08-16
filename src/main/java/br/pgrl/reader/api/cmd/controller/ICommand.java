package br.pgrl.reader.api.cmd.controller;

import br.pgrl.reader.api.dao.IDao;
import br.pgrl.reader.api.view.IView;
import br.pgrl.reader.exceptions.DataQueryException;

public interface ICommand {
	public void exec(String comand,IView iView,IDao dao)  throws DataQueryException;
}

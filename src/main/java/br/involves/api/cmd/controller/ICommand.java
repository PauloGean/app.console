package br.involves.api.cmd.controller;

import br.involves.api.dao.IDao;
import br.involves.api.view.IView;
import br.involves.exceptions.DataQueryException;

public interface ICommand {
	public void exec(String comand,IView iView,IDao dao)  throws DataQueryException;
}

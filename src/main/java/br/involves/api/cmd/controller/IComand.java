package br.involves.api.cmd.controller;

import br.involves.api.dao.IDao;
import br.involves.api.view.IViewIO;
import br.involves.exceptions.DataQueryException;

public interface IComand {
	public void exec(String comand,IViewIO iView,IDao dao)  throws DataQueryException;
}

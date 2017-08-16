package app.involves.api.cmd.controller;

import app.involves.api.dao.IDao;
import app.involves.api.view.IViewIO;
import app.involves.exceptions.ConsultDatesException;

public interface IComand {
	public void exec(String comand,IViewIO iView,IDao dao)  throws ConsultDatesException;
}

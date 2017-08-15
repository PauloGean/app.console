package app.involves.controller;

import app.involves.dao.interfaces.IDao;
import app.involves.exceptions.ConsultDatesException;
import app.involves.view.interfaces.IViewIO;

public interface IComand {
	public void exec(String comand,IViewIO iView,IDao dao)  throws ConsultDatesException;
}

package app.involves.controller;

import app.involves.dao.interfaces.IDao;
import app.involves.exceptions.ConsultDatesException;
import app.involves.view.interfaces.IView;

public interface IComand {
	public void exec(String comand,IView iView,IDao dao)  throws ConsultDatesException;
}

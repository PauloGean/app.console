package app.involves.controller;

import app.involves.dao.interfaces.IDao;
import app.involves.view.interfaces.IView;

public interface IController {
	public IDao getDao();

	public IView getView();
	
	
	public void initView();
}

package app.involves.impl.controller;

import app.involves.api.dao.IDao;
import app.involves.api.view.IView;

public interface IController {
	public IDao getDao();

	public IView getView();
	
	
	public void initView();
}

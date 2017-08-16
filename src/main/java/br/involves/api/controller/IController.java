package br.involves.api.controller;

import br.involves.api.dao.IDao;
import br.involves.api.view.IView;

public interface IController {
	public IDao getDao();

	public IView getView();
	
	
	public void initView();
}

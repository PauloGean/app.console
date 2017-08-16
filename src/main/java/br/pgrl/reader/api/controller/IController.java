package br.pgrl.reader.api.controller;

import br.pgrl.reader.api.dao.IDao;
import br.pgrl.reader.api.view.IView;

public interface IController {
	public IDao getDao();

	public IView getView();
	
	
	public void initView();
}

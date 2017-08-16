package br.involves.impl.controller;

import br.involves.api.controller.IController;
import br.involves.api.dao.IDao;
import br.involves.api.view.IView;
import br.involves.impl.dao.CityDao;
import br.involves.impl.view.CityView;
import br.involves.impl.view.ViewModel;

public class CityController implements IController {

	@Override
	public IDao getDao() {
		return new CityDao();
	}

	@Override
	public IView getView() {
		return new CityView();
	}
	
	@Override
	public void initView() {
		new ViewModel().waitCommand(this);
	}

}

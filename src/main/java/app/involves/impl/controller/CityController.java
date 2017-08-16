package app.involves.impl.controller;

import app.involves.api.controller.IController;
import app.involves.api.dao.IDao;
import app.involves.api.view.IView;
import app.involves.impl.dao.CityDao;
import app.involves.impl.view.CityView;
import app.involves.impl.view.ViewModel;

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

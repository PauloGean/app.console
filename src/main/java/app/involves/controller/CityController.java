package app.involves.controller;

import app.involves.dao.CityDao;
import app.involves.dao.interfaces.IDao;
import app.involves.view.CityView;
import app.involves.view.ViewModel;
import app.involves.view.interfaces.IView;

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

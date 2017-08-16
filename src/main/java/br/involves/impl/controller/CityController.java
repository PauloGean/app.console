package br.involves.impl.controller;

import br.involves.api.controller.IController;
import br.involves.api.dao.IDao;
import br.involves.api.view.IView;
import br.involves.impl.cmd.controller.CommandWait;
import br.involves.impl.dao.CityDao;
import br.involves.impl.view.CityView;

public class CityController implements IController {

	private IDao dao;
	private IView view;
	private CommandWait commandWait;

	public CityController() {
		dao = new CityDao();
		view=new CityView();
		commandWait=new CommandWait(this);
	}

	@Override
	public IDao getDao() {
		return dao;
	}

	@Override
	public IView getView() {
		return view;
	}

	@Override
	public void initView() {
		commandWait.waitCommand();
	}

}

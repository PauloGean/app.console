package br.pgrl.reader.impl.controller;

import br.pgrl.reader.api.controller.IController;
import br.pgrl.reader.api.dao.IDao;
import br.pgrl.reader.api.view.IView;
import br.pgrl.reader.impl.cmd.controller.CommandWait;
import br.pgrl.reader.impl.dao.CityDao;
import br.pgrl.reader.impl.view.CityView;

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

package app.involves.view;

import app.involves.dao.CityDao;
import app.involves.view.interfaces.IView;
import app.involves.view.interfaces.IViewIO;

public class CityView implements IView {
	private IViewIO view;
	private CityDao dao;
	public CityView() {
		dao=new CityDao();
	}

	@Override
	public void setViewIO(IViewIO iViewIO) {
		this.view = iViewIO;
	}

	@Override
	public void initView() {
		new ViewModel().waitCommand(view, dao);
	}

}

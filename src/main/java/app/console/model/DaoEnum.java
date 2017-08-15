package app.console.model;

import app.console.dao.CityDao;
import app.console.dao.interfaces.IDao;

public enum DaoEnum {
	CITY(new CityDao());

	private IDao dao;

	private DaoEnum(IDao dao) {
		this.dao = dao;
	}

	public IDao getDao() {
		return dao;
	}
}

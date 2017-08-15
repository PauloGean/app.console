package app.involves.model;

import app.involves.dao.CityDao;
import app.involves.dao.interfaces.IDao;

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

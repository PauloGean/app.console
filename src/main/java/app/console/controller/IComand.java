package app.console.controller;

import app.console.dao.IDao;

public interface IComand {
	public void exec(String comand,IDao dao);
}

package app.console.controller;

import app.console.dao.interfaces.IDao;
import app.console.exceptions.ReaderFileException;

public interface IComand {
	public void exec(String comand,IDao dao)  throws ReaderFileException;
}

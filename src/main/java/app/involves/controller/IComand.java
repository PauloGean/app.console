package app.involves.controller;

import app.involves.dao.interfaces.IDao;
import app.involves.exceptions.ReaderFileException;

public interface IComand {
	public void exec(String comand,IDao dao)  throws ReaderFileException;
}

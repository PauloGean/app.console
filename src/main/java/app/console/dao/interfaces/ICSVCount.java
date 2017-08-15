package app.console.dao.interfaces;

import app.console.exceptions.ReaderFileException;

public interface ICSVCount {
	public long count()  throws ReaderFileException;
}

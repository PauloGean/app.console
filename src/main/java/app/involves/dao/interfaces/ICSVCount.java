package app.involves.dao.interfaces;

import app.involves.exceptions.ReaderFileException;

public interface ICSVCount {
	public long count()  throws ReaderFileException;
}

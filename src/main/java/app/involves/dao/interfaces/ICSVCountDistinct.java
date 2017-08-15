package app.involves.dao.interfaces;

import app.involves.exceptions.ReaderFileException;

public interface ICSVCountDistinct {
	public long countDistinct(String field) throws ReaderFileException ;
}

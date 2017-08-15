package app.console.dao.interfaces;

import app.console.exceptions.ReaderFileException;

public interface ICSVCountDistinct {
	public long countDistinct(String field) throws ReaderFileException ;
}

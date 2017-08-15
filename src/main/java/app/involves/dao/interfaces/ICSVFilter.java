package app.involves.dao.interfaces;

import java.util.List;

import app.involves.exceptions.ReaderFileException;

public interface ICSVFilter {
	public List<String> filter(String field, String value)  throws ReaderFileException  ;
}

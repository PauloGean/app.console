package app.console.dao.interfaces;

import java.util.List;

import app.console.exceptions.ReaderFileException;

public interface ICSVFilter {
	public List<String> filter(String field, String value)  throws ReaderFileException  ;
}

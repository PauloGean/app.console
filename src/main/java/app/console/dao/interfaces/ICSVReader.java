package app.console.dao.interfaces;

import java.util.List;

import app.console.exceptions.ReaderFileException;

public interface ICSVReader {
	public List<String> getLines() throws ReaderFileException;
}

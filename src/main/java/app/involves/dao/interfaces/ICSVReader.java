package app.involves.dao.interfaces;

import java.util.List;

import app.involves.exceptions.ReaderFileException;

public interface ICSVReader {
	public List<String> getLines() throws ReaderFileException;
}

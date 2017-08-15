package app.console.dao;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import app.console.dao.interfaces.ICSVReader;
import app.console.dao.interfaces.IDaoCSV;
import app.console.exceptions.ReaderFileException;

public class CSVReader implements ICSVReader {
	private IDaoCSV daoCSV;

	public CSVReader(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
	}

	public List<String> getLines() throws ReaderFileException {
		List<String> list = new ArrayList<String>();

		try {
			list = Files.readAllLines(daoCSV.getDirectory().toPath(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			throw new ReaderFileException(daoCSV.getDirectory().toPath().toString(),e);
		}

		return list;
	}
}

package app.involves.impl.csv.dao;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import app.involves.api.csv.dao.ICSVReader;
import app.involves.api.csv.dao.IDaoCSV;
import app.involves.exceptions.ConsultDatesException;

public class CSVReader implements ICSVReader {
	private IDaoCSV daoCSV;

	public CSVReader(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
	}

	public List<String> getLines() throws ConsultDatesException {
		List<String> list = new ArrayList<String>();

		try {
			list = Files.readAllLines(daoCSV.getDirectory().toPath(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			throw new ConsultDatesException(daoCSV.getDirectory().toPath().toString(),e);
		}

		return list;
	}
}

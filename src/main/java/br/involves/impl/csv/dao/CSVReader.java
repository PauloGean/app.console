package br.involves.impl.csv.dao;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import br.involves.api.csv.dao.ICSVReader;
import br.involves.api.csv.dao.IDaoCSV;
import br.involves.exceptions.DataQueryException;

public class CSVReader implements ICSVReader {
	private IDaoCSV daoCSV;

	public CSVReader(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
	}

	public List<String> getLines() throws DataQueryException {
		List<String> list = new ArrayList<String>();

		try {
			list = Files.readAllLines(daoCSV.getDirectory().toPath(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			throw new DataQueryException(daoCSV.getDirectory().toPath().toString(),e);
		}

		return list;
	}
}

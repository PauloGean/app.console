package br.involves.impl.csv.dao;

import java.io.File;
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
		    ClassLoader classLoader = getClass().getClassLoader();
		    String strFile=classLoader.getResource(daoCSV.getDirectory()).getFile();
			list = Files.readAllLines(new File(strFile).toPath(), StandardCharsets.UTF_8);
		} catch (Exception e) {
			throw new DataQueryException(daoCSV.getDirectory(),e);
		}

		return list;
	}
}

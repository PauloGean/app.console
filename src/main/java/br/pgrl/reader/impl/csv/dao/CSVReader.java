package br.pgrl.reader.impl.csv.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import br.pgrl.reader.api.csv.dao.ICSVReader;
import br.pgrl.reader.api.csv.dao.IDaoCSV;
import br.pgrl.reader.exceptions.DataQueryException;

public class CSVReader implements ICSVReader {
	private IDaoCSV daoCSV;

	public CSVReader(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
	}

	public List<String> getLines() throws DataQueryException {
		List<String> list = new ArrayList<String>();

		try {
		    ClassLoader classLoader = getClass().getClassLoader();
		    try (InputStream inputStream = classLoader.getResource(daoCSV.getDirectory()).openStream()) {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
		        String line;
		        while ((line = bufferedReader.readLine()) != null) {
		        	list.add(line);
		        }
		        inputStream.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		} catch (Exception e) {
			throw new DataQueryException(daoCSV.getDirectory(),e);
		}

		return list;
	}
}

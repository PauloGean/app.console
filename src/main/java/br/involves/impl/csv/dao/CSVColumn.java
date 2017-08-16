package br.involves.impl.csv.dao;

import java.util.Arrays;
import java.util.List;

import br.involves.api.csv.dao.ICSVColumn;
import br.involves.api.csv.dao.IDaoCSV;

public class CSVColumn implements ICSVColumn {
	private IDaoCSV daoCSV;

	public CSVColumn(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
	}

	public int getIndexColumn(String field) {
		String[] fields =daoCSV.getHeader().split(daoCSV.getSeparator());
		List<String> fieldList = Arrays.asList(fields);
		return fieldList.indexOf(field.trim());

	}
}

package app.involves.dao;

import java.util.Arrays;
import java.util.List;

import app.involves.dao.interfaces.ICSVColumn;
import app.involves.dao.interfaces.IDaoCSV;

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

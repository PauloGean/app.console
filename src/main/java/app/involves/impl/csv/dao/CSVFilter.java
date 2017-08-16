package app.involves.impl.csv.dao;

import java.util.ArrayList;
import java.util.List;

import app.involves.api.csv.dao.ICSVColumn;
import app.involves.api.csv.dao.ICSVFilter;
import app.involves.api.csv.dao.IDaoCSV;
import app.involves.exceptions.ConsultDatesException;

public class CSVFilter implements ICSVFilter {
	private IDaoCSV daoCSV;
	private ICSVColumn icsvColumn;

	public CSVFilter(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
		this.icsvColumn=new CSVColumn(daoCSV);
	}

	@Override
	public List<String> filter(String field, String value) throws ConsultDatesException {
		int column = icsvColumn.getIndexColumn(field);
		List<String> list = new ArrayList<String>();
		for (String line : daoCSV.getLines()) {
			if (line.contains(daoCSV.getHeader())) {
				continue;
			}
			String[] values = line.split(daoCSV.getSeparator());
			if (values[column].equals(value)) {
				list.add(line);

			}
		}
		return list;
	}
}

package app.involves.dao;

import java.util.ArrayList;
import java.util.List;

import app.involves.dao.interfaces.ICSVColumn;
import app.involves.dao.interfaces.ICSVFilter;
import app.involves.dao.interfaces.IDaoCSV;
import app.involves.exceptions.ReaderFileException;

public class CSVFilter implements ICSVFilter {
	private IDaoCSV daoCSV;
	private ICSVColumn icsvColumn;

	public CSVFilter(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
		this.icsvColumn=new CSVColumn(daoCSV);
	}

	@Override
	public List<String> filter(String field, String value) throws ReaderFileException {
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

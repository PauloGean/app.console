package app.console.dao;

import java.util.ArrayList;
import java.util.List;

import app.console.dao.interfaces.ICSVColumn;
import app.console.dao.interfaces.ICSVFilter;
import app.console.dao.interfaces.IDaoCSV;
import app.console.exceptions.ReaderFileException;

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

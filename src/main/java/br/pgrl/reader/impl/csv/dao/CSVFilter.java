package br.pgrl.reader.impl.csv.dao;

import java.util.ArrayList;
import java.util.List;

import br.pgrl.reader.api.csv.dao.ICSVColumn;
import br.pgrl.reader.api.csv.dao.ICSVFilter;
import br.pgrl.reader.api.csv.dao.IDaoCSV;
import br.pgrl.reader.exceptions.DataQueryException;

public class CSVFilter implements ICSVFilter {
	private IDaoCSV daoCSV;
	private ICSVColumn icsvColumn;

	public CSVFilter(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
		this.icsvColumn=new CSVColumn(daoCSV);
	}

	@Override
	public List<String> filter(String field, String value) throws DataQueryException {
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

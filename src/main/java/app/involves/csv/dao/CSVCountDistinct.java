package app.involves.csv.dao;

import java.util.HashSet;
import java.util.Set;

import app.involves.dao.interfaces.ICSVColumn;
import app.involves.dao.interfaces.ICSVCountDistinct;
import app.involves.dao.interfaces.IDaoCSV;
import app.involves.exceptions.ConsultDatesException;

public class CSVCountDistinct implements ICSVCountDistinct {
	private IDaoCSV daoCSV;
	private ICSVColumn icsvColumn;

	public CSVCountDistinct(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
		this.icsvColumn=new CSVColumn(daoCSV);
	}

	@Override
	public long countDistinct(String field) throws ConsultDatesException {
		int column = icsvColumn.getIndexColumn(field);
		Set<String> set = new HashSet<String>();
		for (String line : this.daoCSV.getLines()) {
			if (line.contains(this.daoCSV.getHeader())) {
				continue;
			}
			String[] values = line.split(this.daoCSV.getSeparator());
			set.add(values[column]);
		}
		return set.size();
	}
}

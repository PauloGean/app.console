package app.console.dao;

import java.util.HashSet;
import java.util.Set;

import app.console.dao.interfaces.ICSVColumn;
import app.console.dao.interfaces.ICSVCountDistinct;
import app.console.dao.interfaces.IDaoCSV;
import app.console.exceptions.ReaderFileException;

public class CSVCountDistinct implements ICSVCountDistinct {
	private IDaoCSV daoCSV;
	private ICSVColumn icsvColumn;

	public CSVCountDistinct(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
		this.icsvColumn=new CSVColumn(daoCSV);
	}

	@Override
	public long countDistinct(String field) throws ReaderFileException {
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

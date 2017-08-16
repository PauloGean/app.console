package br.pgrl.reader.impl.csv.dao;

import java.util.HashSet;
import java.util.Set;

import br.pgrl.reader.api.csv.dao.ICSVColumn;
import br.pgrl.reader.api.csv.dao.ICSVCountDistinct;
import br.pgrl.reader.api.csv.dao.IDaoCSV;
import br.pgrl.reader.exceptions.DataQueryException;

public class CSVCountDistinct implements ICSVCountDistinct {
	private IDaoCSV daoCSV;
	private ICSVColumn icsvColumn;

	public CSVCountDistinct(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
		this.icsvColumn=new CSVColumn(daoCSV);
	}

	@Override
	public long countDistinct(String field) throws DataQueryException {
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

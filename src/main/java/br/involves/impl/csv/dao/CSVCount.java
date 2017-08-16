package br.involves.impl.csv.dao;

import br.involves.api.csv.dao.ICSVCount;
import br.involves.api.csv.dao.IDaoCSV;
import br.involves.exceptions.DataQueryException;

public class CSVCount implements ICSVCount {
	private IDaoCSV daoCSV;

	public CSVCount(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
	}

	@Override
	public long count() throws DataQueryException {
		long count = 0;
		for (String line : this.daoCSV.getLines()) {
			if (line.contains(this.daoCSV.getHeader())) {
				continue;
			}
			count++;
		}
		return count;
	}
}

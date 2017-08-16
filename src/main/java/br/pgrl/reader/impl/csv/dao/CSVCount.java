package br.pgrl.reader.impl.csv.dao;

import br.pgrl.reader.api.csv.dao.ICSVCount;
import br.pgrl.reader.api.csv.dao.IDaoCSV;
import br.pgrl.reader.exceptions.DataQueryException;

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

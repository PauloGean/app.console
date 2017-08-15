package app.involves.csv.dao;

import app.involves.dao.interfaces.ICSVCount;
import app.involves.dao.interfaces.IDaoCSV;
import app.involves.exceptions.ConsultDatesException;

public class CSVCount implements ICSVCount {
	private IDaoCSV daoCSV;

	public CSVCount(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
	}

	@Override
	public long count() throws ConsultDatesException {
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

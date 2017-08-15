package app.involves.dao;

import app.involves.dao.interfaces.ICSVCount;
import app.involves.dao.interfaces.IDaoCSV;
import app.involves.exceptions.ReaderFileException;

public class CSVCount implements ICSVCount {
	private IDaoCSV daoCSV;

	public CSVCount(IDaoCSV daoCSV) {
		this.daoCSV = daoCSV;
	}

	@Override
	public long count() throws ReaderFileException {
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

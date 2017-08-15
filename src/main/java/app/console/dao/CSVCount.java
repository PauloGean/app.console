package app.console.dao;

import app.console.dao.interfaces.ICSVCount;
import app.console.dao.interfaces.IDaoCSV;
import app.console.exceptions.ReaderFileException;

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

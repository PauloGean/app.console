package br.pgrl.reader.api.csv.dao;

import br.pgrl.reader.exceptions.DataQueryException;

public interface ICSVCount {
	public long count()  throws DataQueryException;
}

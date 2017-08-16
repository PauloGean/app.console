package br.pgrl.reader.api.csv.dao;

import br.pgrl.reader.exceptions.DataQueryException;

public interface ICSVCountDistinct {
	public long countDistinct(String field) throws DataQueryException ;
}

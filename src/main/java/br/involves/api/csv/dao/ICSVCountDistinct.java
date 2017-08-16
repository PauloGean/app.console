package br.involves.api.csv.dao;

import br.involves.exceptions.DataQueryException;

public interface ICSVCountDistinct {
	public long countDistinct(String field) throws DataQueryException ;
}

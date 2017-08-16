package br.involves.api.csv.dao;

import br.involves.exceptions.DataQueryException;

public interface ICSVCount {
	public long count()  throws DataQueryException;
}

package br.involves.api.dao;

import java.util.List;

import br.involves.exceptions.DataQueryException;

public interface IDao  {
	public String getHeader();

	public long count()  throws DataQueryException;

	public long countDistinct(String field)  throws DataQueryException;

	public List<String> filter(String field, String value)  throws DataQueryException;

}

package br.involves.api.csv.dao;

import java.util.List;

import br.involves.exceptions.DataQueryException;

public interface ICSVFilter {
	public List<String> filter(String field, String value)  throws DataQueryException  ;
}

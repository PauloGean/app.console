package br.pgrl.reader.api.csv.dao;

import java.util.List;

import br.pgrl.reader.exceptions.DataQueryException;

public interface ICSVFilter {
	public List<String> filter(String field, String value)  throws DataQueryException  ;
}

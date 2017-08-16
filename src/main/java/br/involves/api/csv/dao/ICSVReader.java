package br.involves.api.csv.dao;

import java.util.List;

import br.involves.exceptions.DataQueryException;

public interface ICSVReader {
	public List<String> getLines() throws DataQueryException;
}

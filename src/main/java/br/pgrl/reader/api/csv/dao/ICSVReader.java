package br.pgrl.reader.api.csv.dao;

import java.util.List;

import br.pgrl.reader.exceptions.DataQueryException;

public interface ICSVReader {
	public List<String> getLines() throws DataQueryException;
}

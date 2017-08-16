package br.pgrl.reader.api.csv.dao;

import java.util.List;

import br.pgrl.reader.exceptions.DataQueryException;

public interface IDaoCSV {
	
	public List<String> getLines() throws DataQueryException  ;
	
	public  String getSeparator();

	public  String getHeader();
	
	public  String getDirectory();

}

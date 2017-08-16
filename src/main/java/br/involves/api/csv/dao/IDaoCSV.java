package br.involves.api.csv.dao;

import java.io.File;
import java.util.List;

import br.involves.exceptions.DataQueryException;

public interface IDaoCSV {
	
	public List<String> getLines() throws DataQueryException  ;
	
	public  String getSeparator();

	public  String getHeader();
	
	public  File getDirectory();

}

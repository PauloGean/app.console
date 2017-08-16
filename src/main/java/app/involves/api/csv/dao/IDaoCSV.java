package app.involves.api.csv.dao;

import java.io.File;
import java.util.List;

import app.involves.exceptions.ConsultDatesException;

public interface IDaoCSV {
	
	public List<String> getLines() throws ConsultDatesException  ;
	
	public  String getSeparator();

	public  String getHeader();
	
	public  File getDirectory();

}

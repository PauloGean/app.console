package app.involves.api.csv.dao;

import java.util.List;

import app.involves.exceptions.ConsultDatesException;

public interface ICSVReader {
	public List<String> getLines() throws ConsultDatesException;
}

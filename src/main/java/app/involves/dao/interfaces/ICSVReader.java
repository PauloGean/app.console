package app.involves.dao.interfaces;

import java.util.List;

import app.involves.exceptions.ConsultDatesException;

public interface ICSVReader {
	public List<String> getLines() throws ConsultDatesException;
}

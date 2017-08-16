package app.involves.api.csv.dao;

import java.util.List;

import app.involves.exceptions.ConsultDatesException;

public interface ICSVFilter {
	public List<String> filter(String field, String value)  throws ConsultDatesException  ;
}

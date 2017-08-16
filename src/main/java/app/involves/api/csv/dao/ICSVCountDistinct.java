package app.involves.api.csv.dao;

import app.involves.exceptions.ConsultDatesException;

public interface ICSVCountDistinct {
	public long countDistinct(String field) throws ConsultDatesException ;
}

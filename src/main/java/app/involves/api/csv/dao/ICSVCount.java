package app.involves.api.csv.dao;

import app.involves.exceptions.ConsultDatesException;

public interface ICSVCount {
	public long count()  throws ConsultDatesException;
}

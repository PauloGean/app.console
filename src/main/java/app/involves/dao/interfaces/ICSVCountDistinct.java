package app.involves.dao.interfaces;

import app.involves.exceptions.ConsultDatesException;

public interface ICSVCountDistinct {
	public long countDistinct(String field) throws ConsultDatesException ;
}

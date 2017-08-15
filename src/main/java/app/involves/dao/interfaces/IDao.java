package app.involves.dao.interfaces;

import java.util.List;

import app.involves.exceptions.ConsultDatesException;

public interface IDao  {
	public String getHeader();

	public long count()  throws ConsultDatesException;

	public long countDistinct(String field)  throws ConsultDatesException;

	public List<String> filter(String field, String value)  throws ConsultDatesException;

}

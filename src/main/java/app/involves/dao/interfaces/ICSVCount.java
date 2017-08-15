package app.involves.dao.interfaces;

import app.involves.exceptions.ConsultDatesException;

public interface ICSVCount {
	public long count()  throws ConsultDatesException;
}

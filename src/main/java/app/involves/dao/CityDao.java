package app.involves.dao;

import java.io.File;
import java.util.List;

import app.involves.csv.dao.CSVCount;
import app.involves.csv.dao.CSVCountDistinct;
import app.involves.csv.dao.CSVFilter;
import app.involves.csv.dao.CSVReader;
import app.involves.dao.interfaces.IDao;
import app.involves.dao.interfaces.IDaoCSV;
import app.involves.exceptions.ConsultDatesException;

public class CityDao implements IDao,IDaoCSV {

	@Override
	public String getSeparator() {
		return ",";
	}

	@Override
	public String getHeader() {
		return "ibge_id,uf,name,capital,lon,lat,no_accents,alternative_names,microregion,mesoregion";
	}

	@Override
	public File getDirectory() {
		return new File("../selecao/src/main/resources/cidades/cidades.csv");
	}

	@Override
	public long count() throws ConsultDatesException {
		return new CSVCount(this).count();
	}

	@Override
	public long countDistinct(String field) throws ConsultDatesException {
		return  new CSVCountDistinct(this).countDistinct(field);
	}

	@Override
	public List<String> filter(String field, String value)  throws ConsultDatesException {
		return new CSVFilter(this).filter(field, value);
	}

	@Override
	public List<String> getLines() throws ConsultDatesException {
		return new CSVReader(this).getLines();
	}







}

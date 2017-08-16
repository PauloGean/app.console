package br.involves.impl.dao;

import java.util.List;

import br.involves.api.csv.dao.IDaoCSV;
import br.involves.api.dao.IDao;
import br.involves.exceptions.DataQueryException;
import br.involves.impl.csv.dao.CSVCount;
import br.involves.impl.csv.dao.CSVCountDistinct;
import br.involves.impl.csv.dao.CSVFilter;
import br.involves.impl.csv.dao.CSVReader;

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
	public String getDirectory() {
		return "cidades.csv";
	}

	@Override
	public long count() throws DataQueryException {
		return new CSVCount(this).count();
	}

	@Override
	public long countDistinct(String field) throws DataQueryException {
		return  new CSVCountDistinct(this).countDistinct(field);
	}

	@Override
	public List<String> filter(String field, String value)  throws DataQueryException {
		return new CSVFilter(this).filter(field, value);
	}

	@Override
	public List<String> getLines() throws DataQueryException {
		return new CSVReader(this).getLines();
	}







}

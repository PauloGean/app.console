package br.pgrl.reader.impl.dao;

import java.util.List;

import br.pgrl.reader.api.csv.dao.IDaoCSV;
import br.pgrl.reader.api.dao.IDao;
import br.pgrl.reader.exceptions.DataQueryException;
import br.pgrl.reader.impl.csv.dao.CSVCount;
import br.pgrl.reader.impl.csv.dao.CSVCountDistinct;
import br.pgrl.reader.impl.csv.dao.CSVFilter;
import br.pgrl.reader.impl.csv.dao.CSVReader;

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

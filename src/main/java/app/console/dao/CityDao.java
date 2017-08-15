package app.console.dao;

import java.io.File;
import java.util.List;

import app.console.dao.interfaces.IDao;
import app.console.dao.interfaces.IDaoCSV;
import app.console.exceptions.ReaderFileException;

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
	public long count() throws ReaderFileException {
		return new CSVCount(this).count();
	}

	@Override
	public long countDistinct(String field) throws ReaderFileException {
		return  new CSVCountDistinct(this).countDistinct(field);
	}

	@Override
	public List<String> filter(String field, String value)  throws ReaderFileException {
		return new CSVFilter(this).filter(field, value);
	}

	@Override
	public List<String> getLines() throws ReaderFileException {
		return new CSVReader(this).getLines();
	}







}

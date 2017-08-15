package app.console.dao;

import java.io.File;

public class CityDao extends CSVDao implements IDao {

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





}

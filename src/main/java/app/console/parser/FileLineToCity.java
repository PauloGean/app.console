package app.console.parser;

import app.console.model.City;

public class FileLineToCity implements Converter<String,City>{

	public City convert(String source) { 
		City city=new City();
		String [] vet=source.split(",");
		city.setIbge_id(Integer.valueOf(vet[0]));
		city.setUf(vet[1]);
		city.setName(vet[2]);
		if(vet[3]!=null) {
			city.setCapital(Boolean.getBoolean(vet[3]));
		}else {
			city.setCapital(Boolean.FALSE);
		}
		city.setLon(Double.valueOf(vet[4]));
		city.setLat(Double.valueOf(vet[5]));
		city.setNo_accents(vet[6]);
		city.setAlternative_names(vet[7]);
		city.setMicroregion(vet[8]);
		city.setMesoregion(vet[9]);
		return city;
	}

}

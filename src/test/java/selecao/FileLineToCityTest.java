package selecao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.console.model.City;
import app.console.parser.FileLineToCity;

public class FileLineToCityTest {
	
	@Test
	public void LinePaserTest() {
		
		String stLine="1100015,RO,Alta Floresta D'Oeste,,-61.9998238963,-11.9355403048,Alta Floresta D'Oeste,,Cacoal,Leste Rondoniense";
		FileLineToCity convert=new	FileLineToCity ();
		City city=convert.convert(stLine);
		assertEquals(1100015, city.getIbge_id());
		assertEquals("RO", city.getUf());
		assertEquals("Alta Floresta D'Oeste", city.getName());
		assertEquals(false, city.isCapital());
		assertEquals(	new Double(-61.9998238963), city.getLon());
		assertEquals(new Double(-11.9355403048), city.getLat());
		assertEquals("Alta Floresta D'Oeste", city.getNo_accents());
		assertEquals("", city.getAlternative_names());
		assertEquals("Cacoal", city.getMicroregion());
		assertEquals("Leste Rondoniense", city.getMesoregion());
	}

}

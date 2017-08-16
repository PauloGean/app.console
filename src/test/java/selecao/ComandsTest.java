package selecao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.involves.enums.ComandsEnum;
import app.involves.imp.cmd.controller.Count;
import app.involves.impl.controller.ComandsSelector;

public class ComandsTest {
	@Test
	public void comandCountTest() {
		boolean ok = "count *".matches(ComandsEnum.COUNT.getRegex());
		assertTrue(ok);
		
		ComandsEnum comandsEnum=	ComandsSelector.getComandEnum("count *");
		assertEquals(ComandsEnum.COUNT, comandsEnum);
		assertEquals(ComandsEnum.COUNT.getLabel(), comandsEnum.getLabel());
		assertEquals(ComandsEnum.COUNT.getRegex(), comandsEnum.getRegex());
		assertTrue(Count.class.isInstance(ComandsEnum.COUNT.getiComand()));

	}

	@Test
	public void comandDistinctTest() {
		boolean ok = "count distinct a".matches(ComandsEnum.COUNT_DISTINC.getRegex());
		assertTrue(ok);
		ComandsEnum comandsEnum=	ComandsSelector.getComandEnum("count distinct capital");
		assertEquals(ComandsEnum.COUNT_DISTINC, comandsEnum);
	}

	@Test
	public void filterTest() {
		boolean ok = "filter a a".matches(ComandsEnum.FILTER.getRegex());
		assertTrue(ok);
		ComandsEnum comandsEnum=	ComandsSelector.getComandEnum("filter capital true");
		assertEquals(ComandsEnum.FILTER, comandsEnum);
	}
	
	@Test
	public void noComandTest() {

		ComandsEnum comandsEnum=	ComandsSelector.getComandEnum("aa aa aa");
		assertNull(comandsEnum);
	}

}

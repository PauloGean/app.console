package selecao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.involves.cmd.enums.ComandsEnum;
import br.involves.cmd.util.ComandsSelector;
import br.involves.exceptions.CommandNoFoundException;
import br.involves.impl.cmd.controller.Count;
import br.involves.impl.cmd.controller.CountDistinct;

public class ComandsTest {
	@Test
	public void comandCountTest() throws CommandNoFoundException {
		boolean ok = "count *".matches(ComandsEnum.COUNT.getRegex());
		assertTrue(ok);
		
		ComandsEnum comandsEnum=	ComandsSelector.getComandEnum("count *");
		assertEquals(ComandsEnum.COUNT, comandsEnum);
		assertEquals(ComandsEnum.COUNT.getLabel(), comandsEnum.getLabel());
		assertEquals(ComandsEnum.COUNT.getRegex(), comandsEnum.getRegex());
		assertTrue(Count.class.isInstance(ComandsEnum.COUNT.getiComand()));

	}

	@Test
	public void comandDistinctTest() throws CommandNoFoundException {
		boolean ok = "count distinct a".matches(ComandsEnum.COUNT_DISTINC.getRegex());
		assertTrue(ok);
		ComandsEnum comandsEnum=	ComandsSelector.getComandEnum("count distinct capital");
		assertEquals(ComandsEnum.COUNT_DISTINC, comandsEnum);
		assertEquals(ComandsEnum.COUNT_DISTINC.getLabel(), comandsEnum.getLabel());
		assertEquals(ComandsEnum.COUNT_DISTINC.getRegex(), comandsEnum.getRegex());
		assertTrue(CountDistinct.class.isInstance(ComandsEnum.COUNT_DISTINC.getiComand()));
	}

	@Test
	public void filterTest() throws CommandNoFoundException {
		boolean ok = "filter a a".matches(ComandsEnum.FILTER.getRegex());
		assertTrue(ok);
		ComandsEnum comandsEnum=	ComandsSelector.getComandEnum("filter capital true");
		assertEquals(ComandsEnum.FILTER, comandsEnum);
	}
	
	@Test(expected = CommandNoFoundException.class)
	public void noComandTest() throws CommandNoFoundException {

		ComandsEnum comandsEnum=	ComandsSelector.getComandEnum("aa aa aa");
		assertNull(comandsEnum);
	}

}

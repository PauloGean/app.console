package selecao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.pgrl.reader.cmd.enums.CommandsEnum;
import br.pgrl.reader.cmd.util.CommandsSelector;
import br.pgrl.reader.exceptions.CommandNoFoundException;
import br.pgrl.reader.impl.cmd.controller.Count;
import br.pgrl.reader.impl.cmd.controller.CountDistinct;

public class ComandsTest {
	@Test
	public void comandCountTest() throws CommandNoFoundException {
		boolean ok = "count *".matches(CommandsEnum.COUNT.getRegex());
		assertTrue(ok);
		
		CommandsEnum comandsEnum=	CommandsSelector.getComandEnum("count *");
		assertEquals(CommandsEnum.COUNT, comandsEnum);
		assertEquals(CommandsEnum.COUNT.getLabel(), comandsEnum.getLabel());
		assertEquals(CommandsEnum.COUNT.getRegex(), comandsEnum.getRegex());
		assertTrue(Count.class.isInstance(CommandsEnum.COUNT.getiComand()));

	}

	@Test
	public void comandDistinctTest() throws CommandNoFoundException {
		boolean ok = "count distinct a".matches(CommandsEnum.COUNT_DISTINC.getRegex());
		assertTrue(ok);
		CommandsEnum comandsEnum=	CommandsSelector.getComandEnum("count distinct capital");
		assertEquals(CommandsEnum.COUNT_DISTINC, comandsEnum);
		assertEquals(CommandsEnum.COUNT_DISTINC.getLabel(), comandsEnum.getLabel());
		assertEquals(CommandsEnum.COUNT_DISTINC.getRegex(), comandsEnum.getRegex());
		assertTrue(CountDistinct.class.isInstance(CommandsEnum.COUNT_DISTINC.getiComand()));
	}

	@Test
	public void filterTest() throws CommandNoFoundException {
		boolean ok = "filter a a".matches(CommandsEnum.FILTER.getRegex());
		assertTrue(ok);
		CommandsEnum comandsEnum=	CommandsSelector.getComandEnum("filter capital true");
		assertEquals(CommandsEnum.FILTER, comandsEnum);
	}
	
	@Test(expected = CommandNoFoundException.class)
	public void noComandTest() throws CommandNoFoundException {

		CommandsEnum comandsEnum=	CommandsSelector.getComandEnum("aa aa aa");
		assertNull(comandsEnum);
	}

}

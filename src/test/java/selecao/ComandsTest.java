package selecao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.console.model.ComandsEnum;

public class ComandsTest {
	@Test
	public void comandCountTest() {
		boolean ok = "count *".matches(ComandsEnum.COUNT.getRegex());
		assertTrue(ok);
	}

	@Test
	public void comandDistinctTest() {
		boolean ok = "count a a".matches(ComandsEnum.COUNT_DISTINC.getRegex());
		assertTrue(ok);
	}

	@Test
	public void filterTest() {
		boolean ok = "filter a a".matches(ComandsEnum.FILTER.getRegex());
		assertTrue(ok);
	}

}

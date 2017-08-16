package br.involves.cmd.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.pgrl.reader.cmd.util.CreateInstance;

public class CreateInstanceTest {
	@Test
	public void createInstanceTest() {
		Object str = new CreateInstance<String>().createInstance(String.class);
		assertTrue(String.class.isInstance(str));
	}
}

package br.involves.impl.cmd.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeaderTest {
	@Test
	public void stringTest() {
		String header = new Header().toString();
		String expected=
				"=====Infome um comando=====\n" + 
				"count *\n" + 
				"count distinct [propriedade]\n" + 
				"filter [propriedade] [valor]\n" + 
				"==========================\n" + 
				"cmd >";
		assertEquals(expected, header);
	}
}

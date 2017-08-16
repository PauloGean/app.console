package br.involves.impl.cmd.controller;

import br.involves.cmd.enums.ComandsEnum;

public class Header {
	private static final String CMD = "cmd >";
	private static final String BARRA = "==========================";
	private static final String INFOME_UM_COMANDO = "=====Infome um comando=====";

	public String toString() {
		ComandsEnum[] comandsEnum = ComandsEnum.values();
		StringBuffer buffer=new StringBuffer();
		buffer.append(INFOME_UM_COMANDO);
		for (ComandsEnum comand : comandsEnum) {
			buffer.append(comand.getLabel());
		}
		buffer.append(BARRA);
		buffer.append(CMD);
		return buffer.toString();
	}
}

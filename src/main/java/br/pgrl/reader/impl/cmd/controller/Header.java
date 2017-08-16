package br.pgrl.reader.impl.cmd.controller;

import br.pgrl.reader.cmd.enums.CommandsEnum;

public class Header {
	private static final String N = "\n";
	private static final String CMD = "cmd >";
	private static final String BARRA = "==========================";
	private static final String INFOME_UM_COMANDO = "=====Infome um comando=====";

	public String toString() {
		CommandsEnum[] comandsEnum = CommandsEnum.values();
		StringBuffer buffer=new StringBuffer();
		buffer.append(INFOME_UM_COMANDO);
		buffer.append(N);
		for (CommandsEnum comand : comandsEnum) {
			buffer.append(comand.getLabel());
			buffer.append(N);
		}
		buffer.append(BARRA);
		buffer.append(N);
		buffer.append(CMD);
		return buffer.toString();
	}
}

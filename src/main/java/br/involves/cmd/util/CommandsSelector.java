package br.involves.cmd.util;

import br.involves.cmd.enums.CommandsEnum;
import br.involves.exceptions.CommandNoFoundException;

public class CommandsSelector {
	public static CommandsEnum getComandEnum(String input) throws CommandNoFoundException {
		CommandsEnum comandsReturn = null;
		CommandsEnum[] comandsEnum = CommandsEnum.values();
		for (CommandsEnum comandEnum : comandsEnum) {
			if (input.matches(comandEnum.getRegex())) {
				comandsReturn = comandEnum;
				break;
			}
		}
		if(comandsReturn==null) {
			throw new CommandNoFoundException(input);
		}
		return comandsReturn;
	}
}

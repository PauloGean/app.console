package br.pgrl.reader.cmd.util;

import br.pgrl.reader.cmd.enums.CommandsEnum;
import br.pgrl.reader.exceptions.CommandNoFoundException;

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

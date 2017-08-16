package br.involves.cmd.util;

import br.involves.cmd.enums.ComandsEnum;
import br.involves.exceptions.CommandNoFoundException;

public class ComandsSelector {
	public static ComandsEnum getComandEnum(String input) throws CommandNoFoundException {
		ComandsEnum comandsReturn = null;
		ComandsEnum[] comandsEnum = ComandsEnum.values();
		for (ComandsEnum comandEnum : comandsEnum) {
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

package app.involves.controller;

import app.involves.enums.ComandsEnum;

public class ComandsSelector {
	public static ComandsEnum getComandEnum(String input) {
		ComandsEnum comandsReturn = null;
		ComandsEnum[] comandsEnum = ComandsEnum.values();
		for (ComandsEnum comandEnum : comandsEnum) {
			if (input.matches(comandEnum.getRegex())) {
				comandsReturn = comandEnum;
				break;
			}
		}
		return comandsReturn;
	}
}

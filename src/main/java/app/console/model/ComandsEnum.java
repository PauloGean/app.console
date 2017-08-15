package app.console.model;

import app.console.cmd.controller.Count;
import app.console.cmd.controller.CountDistinct;
import app.console.cmd.controller.Filter;
import app.console.controller.IComand;

public enum ComandsEnum {

	COUNT("count [*]","count *",new Count())	, 
	COUNT_DISTINC("count distinct .*","count distinct [propriedade]",new CountDistinct()), 
	FILTER("filter .* .*","filter [propriedade] [valor]",new Filter())
	;
	private String regex;
	private String label;
	private IComand iComand;

	private ComandsEnum(String regex,String label,IComand iComand) {
		this.regex = regex;
		this.label = label;
		this.iComand=iComand;

	}

	public String getRegex() {
		return regex;
	}

	public String getLabel() {
		return label;
	}

	public IComand getiComand() {
		return iComand;
	}
	
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

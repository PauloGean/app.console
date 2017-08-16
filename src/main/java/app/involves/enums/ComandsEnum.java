package app.involves.enums;

import app.involves.imp.cmd.controller.Count;
import app.involves.imp.cmd.controller.CountDistinct;
import app.involves.imp.cmd.controller.Filter;
import app.involves.impl.controller.IComand;

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
	
	
}

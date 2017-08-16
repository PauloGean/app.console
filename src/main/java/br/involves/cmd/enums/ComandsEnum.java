package br.involves.cmd.enums;

import br.involves.api.cmd.controller.IComand;
import br.involves.impl.cmd.controller.Count;
import br.involves.impl.cmd.controller.CountDistinct;
import br.involves.impl.cmd.controller.Filter;

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

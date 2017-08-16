package br.involves.cmd.enums;

import br.involves.api.cmd.controller.IComand;
import br.involves.cmd.util.CreateInstance;
import br.involves.impl.cmd.controller.Count;
import br.involves.impl.cmd.controller.CountDistinct;
import br.involves.impl.cmd.controller.Filter;

public enum ComandsEnum {

	COUNT("count [*]","count *",Count.class)	, 
	COUNT_DISTINC("count distinct .*","count distinct [propriedade]",CountDistinct.class), 
	FILTER("filter .* .*","filter [propriedade] [valor]",Filter.class)
	;
	private String regex;
	private String label;
	private Class<?> classeComand;

	private ComandsEnum(String regex,String label,Class<?> iComand) {
		this.regex = regex;
		this.label = label;
		this.classeComand=iComand;

	}

	public String getRegex() {
		return regex;
	}

	public String getLabel() {
		return label;
	}

	public IComand getiComand() {
		return new CreateInstance<IComand>().createInstance(classeComand);
	}
	
	
}

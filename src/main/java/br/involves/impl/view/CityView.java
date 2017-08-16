package br.involves.impl.view;

import br.involves.api.view.IView;
import br.involves.api.view.IViewIO;

public class CityView implements IView {
	private Console console;
	public CityView() {
		console=new Console();
	}
	
	public IViewIO getViewIO() {
		return console;
	}

	@Override
	public void show(String msg) {
		getViewIO().write(msg);
	}

	@Override
	public String getInput() {
		return console.getInput();
	}


}

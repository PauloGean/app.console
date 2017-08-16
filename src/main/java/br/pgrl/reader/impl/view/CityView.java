package br.pgrl.reader.impl.view;

import br.pgrl.reader.api.view.IView;
import br.pgrl.reader.api.view.IViewIO;

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

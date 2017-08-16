package br.involves.impl.view;

import br.involves.api.view.IView;
import br.involves.api.view.IViewIO;

public class CityView implements IView {
	public CityView() {
	}
	
	public IViewIO getViewIO() {
		return new Console();
	}

	@Override
	public void show(String msg) {
		getViewIO().write(msg);
	}

	@Override
	public String getInput() {
		return new Console().getInput();
	}


}

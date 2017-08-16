package br.involves.impl.view;

import br.involves.api.view.IView;
import br.involves.api.view.IViewIO;

public class CityView implements IView {
	public CityView() {
	}
	
	@Override
	public IViewIO getViewIO() {
		return new Console();
	}
	@Override
	public void initView() {
		
	}

	



}

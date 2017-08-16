package app.involves.impl.view;

import app.involves.api.view.IView;
import app.involves.api.view.IViewIO;

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

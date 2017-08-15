package app.involves.view;

import app.involves.view.interfaces.IView;
import app.involves.view.interfaces.IViewIO;

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

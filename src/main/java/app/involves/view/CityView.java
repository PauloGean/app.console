package app.involves.view;

import app.involves.model.DaoEnum;
import app.involves.view.interfaces.IView;

public class CityView {
	private IView view;
	public CityView(IView view) {
		this.view=view;
	}
	
	public void init() {
		view.initView(DaoEnum.CITY);
	}


	

}

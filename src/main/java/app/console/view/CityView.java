package app.console.view;

import app.console.model.DaoEnum;
import app.console.view.interfaces.IView;

public class CityView {
	private IView view;
	public CityView(IView view) {
		this.view=view;
	}
	
	public void init() {
		view.initView(DaoEnum.CITY);
	}


	

}

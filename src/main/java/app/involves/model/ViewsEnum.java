package app.involves.model;

import app.involves.view.CityView;
import app.involves.view.interfaces.IView;

public enum ViewsEnum {
	CITY("Cidades",new CityView());

	private IView view;
	private String title;

	private ViewsEnum(String title,IView iView) {
		this.view = iView;
		this.title= title;
	}

	public IView getView() {
		return view;
	}

	public String getTitle() {
		return title;
	}

}

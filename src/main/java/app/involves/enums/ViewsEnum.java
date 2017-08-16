package app.involves.enums;

import app.involves.impl.controller.CityController;
import app.involves.impl.controller.IController;

public enum ViewsEnum {
	CITY("Cidades", new CityController());

	private IController controller;
	private String title;

	private ViewsEnum(String title, IController controller) {
		this.controller = controller;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public IController getController() {
		return controller;
	}

}

package app.involves.model;

import app.involves.controller.CityController;
import app.involves.controller.IController;

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

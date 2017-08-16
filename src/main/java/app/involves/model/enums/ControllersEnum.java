package app.involves.model.enums;

import app.involves.api.controller.IController;
import app.involves.impl.controller.CityController;

public enum ControllersEnum {
	CITY("Cidades", new CityController());

	private IController controller;
	private String title;

	private ControllersEnum(String title, IController controller) {
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

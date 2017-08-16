package br.involves.model.enums;

import br.involves.api.controller.IController;
import br.involves.cmd.util.CreateInstance;
import br.involves.impl.controller.CityController;

public enum ControllersEnum {
	CITY("Cidades", CityController.class);

	private Class<?> controllerClass;
	private String title;

	private ControllersEnum(String title, Class<?>  controller) {
		this.controllerClass = controller;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public IController getController() {
		return new CreateInstance<IController>().createInstance(controllerClass);
	}

}

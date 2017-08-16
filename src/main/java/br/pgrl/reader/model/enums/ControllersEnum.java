package br.pgrl.reader.model.enums;

import br.pgrl.reader.api.controller.IController;
import br.pgrl.reader.cmd.util.CreateInstance;
import br.pgrl.reader.impl.controller.CityController;

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

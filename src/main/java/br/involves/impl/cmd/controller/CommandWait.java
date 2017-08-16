package br.involves.impl.cmd.controller;

import br.involves.api.controller.IController;
import br.involves.api.dao.IDao;
import br.involves.api.view.IView;
import br.involves.cmd.enums.CommandsEnum;
import br.involves.cmd.util.CommandsSelector;
import br.involves.exceptions.CommandNoFoundException;

public class CommandWait {

	private static final String EXIT = "exit";
	private IView view;
	private IDao dao;
	private String header;
	public CommandWait(IController controller) {
		view=controller.getView();
		dao=controller.getDao();
	}
	

	public void waitCommand() {
		for (;;) {
			view.show(new Header().toString());
			String input = view.getInput();
			if (input.trim().equalsIgnoreCase(EXIT)) {
				break;
			}
			try {
				CommandsEnum comandEnum = CommandsSelector.getComandEnum(input);
				new ExecComand().execute(view, dao, input, comandEnum);
			} catch (CommandNoFoundException e) {
				view.show(e.getMessage());
			}
		}
	}

}

package br.involves.impl.cmd.controller;

import br.involves.api.controller.IController;
import br.involves.api.dao.IDao;
import br.involves.api.view.IView;
import br.involves.cmd.enums.ComandsEnum;
import br.involves.cmd.util.ComandsSelector;
import br.involves.exceptions.CommandNoFoundException;

public class ComandWait {

	private static final String EXIT = "exit";

	public void wait(IController controller) {
		IView view = controller.getView();
		IDao dao = controller.getDao();
		for (;;) {
			view.show(new Header().toString());
			String input = view.getInput();
			if (input.trim().equalsIgnoreCase(EXIT)) {
				break;
			}
			try {
				ComandsEnum comandEnum = ComandsSelector.getComandEnum(input);
				new ExecComand().execute(view, dao, input, comandEnum);
			} catch (CommandNoFoundException e) {
				view.show(e.getMessage());
			}
		}
	}

}

package br.involves.impl.view;

import br.involves.api.controller.IController;
import br.involves.api.dao.IDao;
import br.involves.api.view.IView;
import br.involves.cmd.enums.ComandsEnum;
import br.involves.cmd.util.ComandsSelector;
import br.involves.exceptions.CommandNoFoundException;
import br.involves.exceptions.DataQueryException;

public class ViewModel {
	private static final String CMD = "cmd >";
	private static final String BARRA = "==========================";
	private static final String INFOME_UM_COMANDO = "=====Infome um comando=====";
	private static final String EXIT = "exit";

	public void header(IView view) {
		ComandsEnum[] comandsEnum = ComandsEnum.values();
		view.show(INFOME_UM_COMANDO);
		for (ComandsEnum comand : comandsEnum) {
			view.show(comand.getLabel());
		}
		view.show(BARRA);
		view.show(CMD);
	}

	public void waitCommand(IController controller) {
		IView view=controller.getView();
		IDao dao=controller.getDao();
		for (;;) {
			header(view);
			String input = view.getInput();
			if (input.trim().equalsIgnoreCase(EXIT)) {
				break;
			}
			try {
				ComandsEnum comandEnum = ComandsSelector.getComandEnum(input);
				executeComand(view, dao, input, comandEnum);
			} catch (CommandNoFoundException e) {
				view.show(e.getMessage());
			}
		}
	}
	

	

	private void executeComand(IView view, IDao dao, String input, ComandsEnum comandEnum) {
		try {
			comandEnum.getiComand().exec(input, view, dao);
		} catch (DataQueryException e) {
			view.show(e.getMessage());
		}
	}
}

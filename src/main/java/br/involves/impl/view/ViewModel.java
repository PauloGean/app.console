package br.involves.impl.view;

import br.involves.api.controller.IController;
import br.involves.api.dao.IDao;
import br.involves.api.view.IView;
import br.involves.api.view.IViewIO;
import br.involves.cmd.enums.ComandsEnum;
import br.involves.cmd.util.ComandsSelector;
import br.involves.exceptions.DataQueryException;

public class ViewModel {
	private static final String CMD = "cmd >";
	private static final String BARRA = "==========================";
	private static final String INFOME_UM_COMANDO = "=====Infome um comando=====";
	private static final String EXIT = "exit";
	private static final String COMANDO_INVALIDO = "Comando inválido!";

	public void header(IViewIO view) {
		ComandsEnum[] comandsEnum = ComandsEnum.values();
		view.write(INFOME_UM_COMANDO);
		for (ComandsEnum comand : comandsEnum) {
			view.write(comand.getLabel());
		}
		view.write(BARRA);
		System.out.print(CMD);
	}

	public void waitCommand(IController controller) {
		IView view=controller.getView();
		IDao dao=controller.getDao();
		for (;;) {
			header(view.getViewIO());
			String input = view.getViewIO().getInput();
			if (input.trim().equalsIgnoreCase(EXIT)) {
				break;
			}
			ComandsEnum comandEnum = ComandsSelector.getComandEnum(input);
			if (comandEnum == null) {
				view.getViewIO().write(COMANDO_INVALIDO);
			} else {
				executeComand(view.getViewIO(), dao, input, comandEnum);
			}
		}
	}

	private void executeComand(IViewIO view, IDao dao, String input, ComandsEnum comandEnum) {
		try {
			comandEnum.getiComand().exec(input, view, dao);
			Console.clear();
		} catch (DataQueryException e) {
			view.write(e.getMessage());
		}
	}
}

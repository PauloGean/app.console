package app.involves.view;

import app.involves.controller.ComandsSelector;
import app.involves.dao.interfaces.IDao;
import app.involves.exceptions.ConsultDatesException;
import app.involves.model.ComandsEnum;
import app.involves.view.interfaces.IViewIO;

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

	public void waitCommand(IViewIO view, IDao dao) {
		for (;;) {
			header(view);
			String input = view.getInput();
			if (input.trim().equalsIgnoreCase(EXIT)) {
				break;
			}
			ComandsEnum comandEnum = ComandsSelector.getComandEnum(input);
			if (comandEnum == null) {
				view.write(COMANDO_INVALIDO);
			} else {
				executeComand(view, dao, input, comandEnum);
			}
		}
	}

	private void executeComand(IViewIO view, IDao dao, String input, ComandsEnum comandEnum) {
		try {
			comandEnum.getiComand().exec(input, view, dao);
			Console.clear();
		} catch (ConsultDatesException e) {
			view.write(e.getMessage());
		}
	}
}

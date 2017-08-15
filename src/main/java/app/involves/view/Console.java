package app.involves.view;

import java.util.Scanner;

import app.involves.exceptions.ConsultDatesException;
import app.involves.model.ComandsEnum;
import app.involves.model.DaoEnum;
import app.involves.view.interfaces.IView;

public class Console implements IView {
	private static final String EXIT = "exit";
	private static final String CLEAR = "clear";
	private static final String CLS = "cls";
	private static final String WINDOWS = "Windows";
	private static final String OS_NAME = "os.name";
	private static final String COMANDO_INVALIDO = "Comando inválido!";

	public final static void clear() {
		try {
			final String os = System.getProperty(OS_NAME);
			if (os.contains(WINDOWS)) {
				Runtime.getRuntime().exec(CLS);

			} else {
				Runtime.getRuntime().exec(CLEAR);
			}
		} catch (final Exception e) {
		}
	}

	public void initView(DaoEnum daoEnum) {
		for (;;) {
			header();
			String input = getInput();
			if (input.trim().equalsIgnoreCase(EXIT)) {
				break;
			}
			ComandsEnum comandEnum = ComandsEnum.getComandEnum(input);
			if (comandEnum == null) {
				write(COMANDO_INVALIDO);
			} else {
				executeComand(daoEnum, input, comandEnum);
			}
		}
	}

	private void executeComand(DaoEnum daoEnum, String input, ComandsEnum comandEnum) {
		try {
			comandEnum.getiComand().exec(input,this, daoEnum.getDao());
			Console.clear();
		} catch (ConsultDatesException e) {
			write(e.getMessage());
		}
	}

	@SuppressWarnings("resource")
	public String getInput() {
		return new Scanner(System.in).nextLine();
	}

	public void header() {
		ComandsEnum[] comandsEnum = ComandsEnum.values();
		write("=====Infome um comando=====");
		for (ComandsEnum comand : comandsEnum) {
			write(comand.getLabel());
		}
		write("==========================");
		System.out.print(">");
	}

	@Override
	public void write(String out) {
		System.out.println(out);
	}
}

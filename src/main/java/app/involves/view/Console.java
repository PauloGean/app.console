package app.involves.view;

import java.util.Scanner;

import app.involves.exceptions.ConsultDatesException;
import app.involves.model.ComandsEnum;
import app.involves.model.DaoEnum;
import app.involves.view.interfaces.IView;

public class Console implements IView {
	private static final String COMANDO_INVALIDO = "Comando inválido!";

	public final static void clear() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");

			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
		}
	}
	
	
	public void initView(DaoEnum daoEnum) {
		Scanner read = new Scanner(System.in);
		for (;;) {
			header();
			String input = read.nextLine();
			if(input.trim().equalsIgnoreCase("exit")) {
				break;
			}
			ComandsEnum  comandEnum=ComandsEnum.getComandEnum(input);
			if(comandEnum==null) {
				write(COMANDO_INVALIDO);
			}else {
				try {
					comandEnum.getiComand().exec(input,daoEnum.CITY.getDao());
					Console.clear();
				} catch (ConsultDatesException e) {
					write(e.getMessage());
				}
				
			}

		}
	}
	
	public void header() {
		ComandsEnum[] comandsEnum=ComandsEnum.values();
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

package app.console.view;

import java.util.Scanner;

import app.console.model.ComandsEnum;
import app.console.model.DaoEnum;

public class CityView {
	private static final String COMANDO_INVALIDO = "Comando inválido!";

	
	public void init() {
		Scanner read = new Scanner(System.in);

		for (;;) {
			Console.header();
			String input = read.nextLine();
			ComandsEnum  comandEnum=ComandsEnum.getComandEnum(input);
			if(comandEnum==null) {
				System.out.println(COMANDO_INVALIDO);
			}else {
				comandEnum.getiComand().exec(input,DaoEnum.CITY.getDao());
				Console.clear();
			}

		}
	}


	

}

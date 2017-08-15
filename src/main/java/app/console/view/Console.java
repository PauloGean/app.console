package app.console.view;

import app.console.model.ComandsEnum;

public class Console {

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
	
	public static void header() {
		ComandsEnum[] comandsEnum=ComandsEnum.values();
		System.out.println("=====Infome um comando=====");
		for (ComandsEnum comand : comandsEnum) {
			System.out.println(comand.getLabel());
		}
		System.out.println("==========================");
		System.out.print(">");
	}
}

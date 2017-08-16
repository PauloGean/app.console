package app.involves.impl.view;

import java.util.Scanner;

import app.involves.api.view.IViewIO;
import app.involves.cmd.enums.ComandsEnum;

public class Console implements IViewIO {

	private static final String CLEAR = "clear";
	private static final String CLS = "cls";
	private static final String WINDOWS = "Windows";
	private static final String OS_NAME = "os.name";


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



	@SuppressWarnings("resource")
	public String getInput() {
		return new Scanner(System.in).nextLine();
	}


	@Override
	public void write(String out) {
		System.out.println(out);
	}
}

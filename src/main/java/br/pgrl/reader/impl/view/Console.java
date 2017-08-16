package br.pgrl.reader.impl.view;

import java.util.Scanner;

import br.pgrl.reader.api.view.IViewIO;

public class Console implements IViewIO {
	private Scanner scanner;

	public Console() {
		scanner = new Scanner(System.in);
	}

	@SuppressWarnings("resource")
	public String getInput() {
		return scanner.nextLine();
	}

	@Override
	public void write(String out) {
		System.out.println(out);
	}
}

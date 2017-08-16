package br.involves.impl.view;

import java.util.Scanner;

import br.involves.api.view.IViewIO;

public class Console implements IViewIO {


	@SuppressWarnings("resource")
	public String getInput() {
		return new Scanner(System.in).nextLine();
	}


	@Override
	public void write(String out) {
		System.out.println(out);
	}
}

package app.console;

import app.console.view.CityView;
import app.console.view.Console;

/**
 *
 * count * - escreve no console a contagem total de registros importados (n�o
 * deve considerar a linha de cabe�alho) count distinct [propriedade] - escreve
 * no console o total de valores distintos da propriedade (coluna) enviada
 * filter [propriedade] [valor] - escreve no console a linha de cabe�alho e
 * todas as linhas em que a propriedade enviada possua o valor enviado
 * 
 * @author paulo.lopes
 *
 */

public class App {

	public static void main(String[] args) {
		new CityView(new Console()).init();
	}

}

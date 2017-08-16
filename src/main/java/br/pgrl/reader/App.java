package br.pgrl.reader;

import br.pgrl.reader.api.controller.IController;
import br.pgrl.reader.api.view.IViewIO;
import br.pgrl.reader.impl.view.Console;
import br.pgrl.reader.model.enums.ControllersEnum;

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
		IViewIO iViewIO = new Console();
		iViewIO.write("Arquivo SCV:");
		iViewIO.write(ControllersEnum.CITY.getTitle());
		IController controller = ControllersEnum.CITY.getController();
		controller.initView();

	}

}

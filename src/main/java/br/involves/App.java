package br.involves;

import br.involves.api.controller.IController;
import br.involves.api.view.IViewIO;
import br.involves.impl.view.Console;
import br.involves.model.enums.ControllersEnum;

/**
 *
 * count * - escreve no console a contagem total de registros importados (não
 * deve considerar a linha de cabeçalho) count distinct [propriedade] - escreve
 * no console o total de valores distintos da propriedade (coluna) enviada
 * filter [propriedade] [valor] - escreve no console a linha de cabeçalho e
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

package app.involves;

import app.involves.api.controller.IController;
import app.involves.api.view.IView;
import app.involves.api.view.IViewIO;
import app.involves.impl.view.CityView;
import app.involves.impl.view.Console;
import app.involves.model.enums.ControllersEnum;

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
		IViewIO iViewIO=new Console();
		ControllersEnum[] enums=ControllersEnum.values();
		iViewIO.write("Informe um arquivo para leitura");
		for (ControllersEnum viewsEnum : enums) {
			iViewIO.write(viewsEnum.getTitle());
		}
		String file=iViewIO.getInput();
		IController controller=ControllersEnum.CITY.getController();
		controller.initView();

	}

}

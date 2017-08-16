package app.involves;

import app.involves.api.view.IView;
import app.involves.api.view.IViewIO;
import app.involves.enums.ViewsEnum;
import app.involves.impl.controller.IController;
import app.involves.impl.view.CityView;
import app.involves.impl.view.Console;

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
		IViewIO iViewIO=new Console();
		ViewsEnum[] enums=ViewsEnum.values();
		iViewIO.write("Informe um arquivo para leitura");
		for (ViewsEnum viewsEnum : enums) {
			iViewIO.write(viewsEnum.getTitle());
		}
		String file=iViewIO.getInput();
		IController controller=ViewsEnum.CITY.getController();
		controller.initView();

	}

}

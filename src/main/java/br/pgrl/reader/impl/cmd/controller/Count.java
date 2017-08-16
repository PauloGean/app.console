package br.pgrl.reader.impl.cmd.controller;

import br.pgrl.reader.api.cmd.controller.ICommand;
import br.pgrl.reader.api.dao.IDao;
import br.pgrl.reader.api.view.IView;
import br.pgrl.reader.exceptions.DataQueryException;

public class Count implements ICommand {
	private static final String TOTAL_DE_REGISTROS = "Total de Registros:%s";

	@Override
	public void exec(String args, IView iView, IDao dao) throws DataQueryException {
		iView.show(String.format(TOTAL_DE_REGISTROS, dao.count()));
	}

}

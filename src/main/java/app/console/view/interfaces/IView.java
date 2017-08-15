package app.console.view.interfaces;

import app.console.model.DaoEnum;

public interface IView {
	public void initView(DaoEnum daoEnum);
	public void write(String string);
}

package app.involves.view.interfaces;

import app.involves.model.DaoEnum;

public interface IView {
	public void initView(DaoEnum daoEnum);
	public void write(String string);
	public String getInput() ;
	
}

package br.involves.exceptions;

public class CommandNoFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public CommandNoFoundException(String cmd)
    {
      super(String.format("Comando não encontrado: %s", cmd));
    }

}

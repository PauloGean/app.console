package br.pgrl.reader.exceptions;

public class CommandNoFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public CommandNoFoundException(String cmd)
    {
      super(String.format("Comando n�o encontrado: %s", cmd));
    }

}

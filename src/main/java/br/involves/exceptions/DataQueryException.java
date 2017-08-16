package br.involves.exceptions;

public class DataQueryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public DataQueryException(String file,Throwable throwable)
    {
      super(String.format("Erro ao ler o arquivo: %s", file),throwable);
    }

}

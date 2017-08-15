package app.console.exceptions;

public class ReaderFileException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public ReaderFileException(String file,Throwable throwable)
    {
      super(String.format("Erro ao ler o arquivo: %s", file),throwable);
    }

}

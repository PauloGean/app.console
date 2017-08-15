package app.involves.exceptions;

public class ConsultDatesException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public ConsultDatesException(String file,Throwable throwable)
    {
      super(String.format("Erro ao ler o arquivo: %s", file),throwable);
    }

}

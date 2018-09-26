package br.com.cursoudemy.services.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	// Sobrecarga para repassar a exeção para classe 
	public ObjectNotFoundException(String message) {
		super(message);
	}

}

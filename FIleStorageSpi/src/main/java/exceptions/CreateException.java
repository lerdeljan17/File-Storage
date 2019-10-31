package exceptions;

public class CreateException extends Exception {

	public CreateException() {
		super("Greska prilikom kreiranja!");
	}
	
	public CreateException(String text) {
		super("Greska prilikom kreiranja! " + text);
	}
}

package exceptions;

public class NotFoundException extends Exception{

	public NotFoundException(String text) {
		super("Nije pronadjen " + text);
	}
	
}

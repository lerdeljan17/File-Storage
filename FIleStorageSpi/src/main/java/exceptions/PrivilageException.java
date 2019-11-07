package exceptions;

public class PrivilageException extends Exception{

	public PrivilageException() {
		super("Nedovoljno visok nivo privilegije!");
	}
	
	public PrivilageException(String text) {
		super("Nedovoljno visok nivo privilegije! " + text);
	}
	
}

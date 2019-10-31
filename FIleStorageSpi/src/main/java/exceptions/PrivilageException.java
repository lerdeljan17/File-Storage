package exceptions;

public class PrivilageException extends Exception{

	public PrivilageException() {
		super("Nedovoljno visok nivo privilegije!");
	}	
}

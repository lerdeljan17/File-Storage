package exceptions;

public class UploadException extends Exception{

	public UploadException() {
		super("Greska prilikom postavljanja!");
	}
	
	public UploadException(String text) {
		super("Greska prilikom postavljanja! " + text);
	}
	
}

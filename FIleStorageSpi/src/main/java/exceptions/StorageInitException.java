package exceptions;

public class StorageInitException extends Exception{
	
	public StorageInitException() {
		super("Greska prilikom inicijalizacije!");
	}
	
	public StorageInitException(String text) {
		super("Greska prilikom inicijalizacije! " + text);
	}
	
}

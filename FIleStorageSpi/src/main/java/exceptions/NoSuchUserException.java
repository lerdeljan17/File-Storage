package exceptions;

public class NoSuchUserException extends Exception{

	public NoSuchUserException() {
		super("Ne postojeci korisnik!");
	}
	
}

package exceptions;

public class RemoteConnectionException extends Exception {
	
	public RemoteConnectionException() {
		super("Greska prilikom konektovanja na udaljeno skladiste!");
	}

}

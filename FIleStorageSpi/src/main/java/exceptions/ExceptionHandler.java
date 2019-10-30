package exceptions;

public class ExceptionHandler {

	public static void noFilesFoundException () {
		System.out.println("Fajl ne postoji!");
	}
	
	public static void downloadException() {
		System.out.println("Greska prilikom preuzimanja!");
	}
	
	public static void uploadException() {
		System.out.println("Greska prilikom postavljanja!");
	}
	
	public static void storageInitException() {
		System.out.println("Greska prilikom inicijalizacije!");
	}
	
	public static void noSuchUserException() {
		System.out.println("Korisnik ne postoji!");
	}
	
	public static void privilageExeption() {
		System.out.println("Nedovoljno visok nivo privilegije!");
	}
	
	public static void notFileStorageException() {
		System.out.println("File Storage nije odgovarajuceg formata!");
	}
	
	public static void messageException(String message) {
		System.out.println(message);
	}
}

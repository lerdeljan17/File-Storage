package raf.rs.FIleStorageSpi;

import java.io.File;
import java.util.List;

public interface myDir {

	/**
	 * @param path - Putanja do skladista
	 * @param rootDirName - Naziv direktorijuma u skladistu
	 * @return boolean - Obavestenje da li je uspesno inicijalizovano skladiste sa prosledjenim root direktorijumom
	 */
	boolean initFileStorage(String path, String rootDirName) throws Exception;

	/**
	 * @param dirPath
	 * @param searchFor
	 * @return
	 */
	File[] searchDirectory(String dirPath, String searchFor);

	/**
	 * Kreira vise direktorijuma ciji ce naziv biti rezultat konkatenacije parametra dirsName i neke od vrednosti iz intervala [0, numberOfDirs) 
	 * @param path - putanja na kojoj ce se kreirati direktorijumi
	 * @param dirsName - segment naziva direktorijuma
	 * @param numberOfDirs - broj direktorijuma koji ce se kreirati. Uslov : numberOfDirs > 0
	 * @return
	 */
	boolean createMultipleDirectories(String path, String dirsName, int numberOfDirs) throws Exception;

	/**
	 * Metoda za kreiranje praznog direktorijuma.
	 * @param path - putanja na kojoj ce se kreirati prazan direktorijum
	 * @param fileName - ime direktorijuma
	 * @return
	 */
	File createEmptyDirectory(String path, String fileName) throws Exception;

	/**
	 * Metoda koja brise direktorijum.
	 * @param path - putanja sa koje ce se obrisati direktorijum
	 * @param dirName - ime direktorijuma koji se brise
	 * @return
	 */
	boolean delDirectory(String path, String dirName) throws Exception;

	/**
	 * Metoda za preuzimanje direktorijuma.
	 * @param pathSource - putanja sa koje ce se preuzeti direktorijum
	 * @param pathDest - putanja na koju ce se smestiti preuzeti direktorijum
	 * @return
	 */
	boolean downloadDirectory(String pathSource, String pathDest) throws Exception;

	/**
	 * @param dirPathToList
	 * @return
	 */
	String listDirectories(String dirPath);

	/**
	 * @param dirPathTolist
	 * @return
	 */
	String listFiles(String dirPath);

	/**
	 * Metoda koja vraca sve fajlove odredjene ekstanzije.
	 * @param path - putanja na kojoj se nalaze fajlovi
	 * @param extension - ekstenzija koje trebaju biti fajlovi
	 * @return
	 */
	List<File> getFilesWithExtension(String path, String extension);

	/**
	 * @param withMetaData
	 * @return
	 */
	File getFilesWithMetadata(boolean withMetaData);

	/**
	 * Vraca fajlove po imenima u direktorijumu i svim poddirektorijumima
	 * @param sorted - true = vratice sortirani zapise
	 * @param fromDirPath - putanja direktorijuma koji ce smatrati root direktorijumom za ovu metodu
	 * @return
	 */
	List<String> getAllFiles(boolean sorted, String dirPath) throws Exception;
	

	/**
	 * Metoda koja prosiruje listu zabranjenih ekstanzija prosledjenom ekstanzijom.
	 * @param extension - ekstanzija
	 */
	void setForbiddenExtension(String extension);

}

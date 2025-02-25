package raf.rs.FIleStorageSpi;

import java.io.File;
import java.util.List;

public interface MyDir {

	/**
	 * Pretraga direktorijuma
	 * Vraca fajlove koji u imenu imaju parametar searchFor
	 * @param dirPath - putanja direktorima koji se pretrazuje
	 * @param searchFor - patern po kome trazimo 
	 * @return
	 */
	File[] searchDirectory(String dirPath, String searchFor);

	/**
	 * Kreira vise direktorijuma ciji ce naziv biti rezultat konkatenacije parametra
	 * dirsName i neke od vrednosti iz intervala [0, numberOfDirs)
	 * 
	 * @param path         - putanja na kojoj ce se kreirati direktorijumi
	 * @param dirsName     - segment naziva direktorijuma
	 * @param numberOfDirs - broj direktorijuma koji ce se kreirati. Uslov :
	 *                     numberOfDirs > 0
	 * @return
	 */
	boolean createMultipleDirectories(String path, String dirsName, int numberOfDirs) throws Exception;

	/**
	 * Metoda za kreiranje praznog direktorijuma.
	 * 
	 * @param path     - putanja na kojoj ce se kreirati prazan direktorijum
	 * @param fileName - ime direktorijuma
	 * @return
	 */
	File createEmptyDirectory(String path, String fileName) throws Exception;

	/**
	 * Metoda za kreiranje praznog direktorijuma koja vraca boolean umesto fajl.
	 * 
	 * @param path     - putanja na kojoj ce se kreirati prazan direktorijum
	 * @param fileName - ime direktorijuma
	 * @return
	 */
	boolean createEmptyDirectoryB(String path, String fileName) throws Exception;

	/**
	 * Metoda koja brise direktorijum.
	 * 
	 * @param path    - Ne navoditi ime direktorijuma! Putanja sa koje ce se
	 *                obrisati direktorijum
	 * @param dirName - ime direktorijuma koji se brise
	 * @return
	 */
	boolean delDirectory(String path, String dirName) throws Exception;

	/**
	 * Metoda za preuzimanje direktorijuma.
	 * 
	 * @param pathSource - putanja sa koje ce se preuzeti direktorijum
	 * @param pathDest   - putanja na koju ce se smestiti preuzeti direktorijum
	 * @return
	 */
	boolean downloadDirectory(String pathSource, String pathDest) throws Exception;

	/**
	 * Meta koja vraca sve direktorijume prosledjenog direktorijuma
	 * @param dirPathToList - za tu putanju uzima direktorijum koji pretrazuje
	 * @return
	 */
	String listDirectories(String dirPath);

	/**
	 * vraca string svih fajlova sa ili bez meta podataka u zavisnosti od parametra
	 * withMetaData
	 * 
	 * @param dirPathTolist - putanja do direktorijuma
	 * @param withMetaData - false
	 * @return
	 */
	String listFiles(String dirPath, boolean withMetaData);

	/**
	 * Metoda koja vraca sve fajlove odredjene ekstanzije.
	 * 
	 * @param path      - putanja na kojoj se nalaze fajlovi
	 * @param extension - ekstenzija koje trebaju biti fajlovi
	 * @return
	 */
	List<File> getFilesWithExtension(String path, String extension);

	/**
	 * Preuzima sve fajlova sa meta*-data
	 * @param withMetaData
	 * @return
	 */
	File getFilesWithMetadata(boolean withMetaData);

	/**
	 * Vraca fajlove po imenima u direktorijumu i svim poddirektorijumima
	 * 
	 * @param sorted      - true = vratice sortirani zapise
	 * @param fromDirPath - putanja direktorijuma koji ce smatrati root
	 *                    direktorijumom za ovu metodu
	 * @return
	 */
	List<String> getAllFiles(boolean sorted, String dirPath) throws Exception;

}

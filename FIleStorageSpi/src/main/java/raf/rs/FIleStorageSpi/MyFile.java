package raf.rs.FIleStorageSpi;

import java.io.File;
import java.util.Hashtable;
import java.util.List;

public interface MyFile {

	/**
	 * Brise fajl sa proslenjene putanje
	 * @param path - putanje
	 * @param fileName - ime fajla koji se brise
	 * @return
	 */
	boolean delFile(String path, String fileName) throws Exception;

	/**
	 * Kreiranje novog fajla
	 * @param path - putanja gde se kreira
	 * @param fileName - ime fajla koji se kreira
	 * @return
	 */
	boolean createEmptyFile(String path, String fileName) throws Exception;

	/**
	 * Skidanje fajla
	 * @param pathSource - putanja sa koje se skida
	 * @param pathDest   - Treba dodati punu putanju, sa sve imenom! Destinacija na
	 *                   koju ce se fajl skinuti. Ne zavisi od putanje do root-a
	 *                   skladista.
	 * @return
	 */
	boolean downloadFile(String pathSource, String pathDest) throws Exception;

	/**
	 * Preuzimanje fajla
	 * @param pathSource - putanja fajla koji se preuzima
	 * @param pathDest   - Mora biti navedena puna putanja, sa sve imenom!
	 *                   Upload-uje na destinaciju pathDest, ukoliko se ostavi
	 *                   prazan string, upload ce biti izvrsen na root skladista.
	 * @return
	 */
	boolean uploadFile(String pathSource, String pathDest) throws Exception;

	/**
	 * Kreiranje vise fajlova
	 * @param path - putanja na koje se kreiraju
	 * @param fileName - ime fajla
	 * @param numberOfFiles - broj fajlova
	 * @return
	 */
	boolean createMultipleFiles(String path, String fileName, int numberOfFiles) throws Exception;

	/**
	 * Upload vise fajlova
	 * @param pathDest - putanja gde ce biti upload-ovani
	 * @param files - lista fajlova koji se upload-uju
	 * @return
	 */
	boolean uploadMultipleFiles(String pathDest, List<File> files) throws Exception;

	/**
	 * Kreiranje metadata
	 * @param FilePath - putanja na kojoj ce se napraviti fajl
	 * @param metaData - hash tabla vrednosti key-value
	 * @return
	 */
	boolean createMetaDataFile(String FilePath, Hashtable<String, String> metaData);

	/**
	 * Dodovanje podataka tipa metadata
	 * @param metaFilePath - gde se nalazi fajl, sa sve .metaData
	 * @param metaData - sta se dodaje
	 * @return
	 */
	boolean addMetaData(String metaFilePath, Hashtable<String, String> metaData);

	/**
	 * Uploaduje arhivu na prosledjenu destinaciju.
	 * 
	 * @param archivePath - Putanja do arhive koju zelimo da upload-ujemo.
	 * @param destPath    - Destinacija na koju zelimo da je upload-ujemo. FOLDER!
	 * @return
	 */
	boolean uploadArchive(String archivePath, String destPath) throws Exception;

}

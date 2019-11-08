package raf.rs.FIleStorageSpi;

import java.io.File;
import java.util.Hashtable;
import java.util.List;

public interface MyFile {

	/**
	 * @param path
	 * @param fileName
	 * @return
	 */
	boolean delFile(String path, String fileName) throws Exception;

	/**
	 * @param patest
	 * @param fileName
	 * @return
	 */
	boolean createEmptyFile(String path, String fileName) throws Exception;

	/**
	 * @param pathSource
	 * @param pathDest - Treba dodati punu putanju, sa sve imenom! Destinacija na koju ce se fajl skinuti. Ne zavisi od putanje do root-a skladista.
	 * @return
	 */
	boolean downloadFile(String pathSource, String pathDest) throws Exception;

	/**
	 * @param pathSource
	 * @param pathDest - Mora biti navedena puna putanja, sa sve imenom! Upload-uje na destinaciju pathDest, ukoliko se ostavi prazan string, upload ce biti izvrsen na root skladista.
	 * @return
	 */
	boolean uploadFile(String pathSource, String pathDest) throws Exception;

	/**
	 * @param path
	 * @param fileName
	 * @param numberOfFiles
	 * @return
	 */
	boolean createMultipleFiles(String path, String fileName, int numberOfFiles) throws Exception;

	/**
	 * @param pathDest
	 * @param files
	 * @return
	 */
	boolean uploadMultipleFiles(String pathDest, List<File> files) throws Exception;

	/**
	 * @param FilePath
	 * @param metaFileName
	 * @param metaData
	 * @return
	 */
	boolean createMetaDataFile(String FilePath, String metaFileName, Hashtable<String, String> metaData);

	/**
	 * @param metaFilePath
	 * @param metaData
	 * @return
	 */
	boolean addMetaData(String metaFilePath, Hashtable<String, String> metaData);

	/**
	 * Uploaduje arhivu na prosledjenu destinaciju.
	 * @param archivePath - Putanja do arhive koju zelimo da upload-ujemo.
	 * @param destPath - Destinacija na koju zelimo da je upload-ujemo.
	 * @return
	 */
	boolean uploadArchive(String archivePath, String destPath) throws Exception;


}

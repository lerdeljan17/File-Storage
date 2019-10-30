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
	 * @param path
	 * @param dirsName
	 * @param numberOfDirs
	 * @return
	 */
	boolean createMultipleDirectories(String path, String dirsName, int numberOfDirs);

	/**
	 * @param path
	 * @param fileName
	 * @return
	 */
	File createEmptyDirectory(String path, String fileName);

	/**
	 * @param ToDelPath
	 * @param dirName
	 * @return
	 */
	boolean delDirectory(String ToDelPath, String dirName);

	/**
	 * @param pathSource
	 * @param pathDest
	 * @return
	 */
	boolean downloadDirectory(String pathSource, String pathDest);

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
	 * @param path
	 * @param extension
	 * @return
	 */
	List<File> getFilesWithExtension(String path, String extension);

	/**
	 * @param withMetaData
	 * @return
	 */
	File getFilesWithMetadata(boolean withMetaData);

	/**
	 * @param sorted
	 * @param fromDirPath
	 * @return
	 */
	List<File> getAllFiles(boolean sorted, String fromDirPath);

}

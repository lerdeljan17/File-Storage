package raf.rs.FIleStorageSpi;

import java.io.File;
import java.util.List;

public interface myDir {

	/**
	 * @param path
	 * @param rootDirName
	 * @return
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
	File createEmptyDir(String path, String fileName);

	/**
	 * @param ToDelPath
	 * @param dirName
	 * @return
	 */
	boolean delDir(String ToDelPath, String dirName);

	/**
	 * @param pathSource
	 * @param pathDest
	 * @return
	 */
	boolean downloadDir(String pathSource, String pathDest);

	/**
	 * @param dirPathToList
	 * @return
	 */
	String listDirs(String dirPathToList);

	/**
	 * @param dirPathTolist
	 * @return
	 */
	String listFiles(String dirPathTolist);

	/**
	 * @param extension
	 * @return
	 */
	File getFilesWithExtension(String extension);

	/**
	 * @param withMetaData
	 * @return
	 */
	File getFilesWithMetadata(boolean withMetaData);

	/**
	 * @param Sorted
	 * @param fromDirPath
	 * @return
	 */
	List<File> getAllFiles(boolean Sorted, String fromDirPath);

}

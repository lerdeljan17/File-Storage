package raf.rs.FIleStorageSpi;

import java.io.File;
import java.util.Hashtable;
import java.util.List;

public interface myFile {

	/**
	 * @param path
	 * @param fileName
	 * @return
	 */
	boolean delFile(String path, String fileName);

	/**
	 * @param patest
	 * @param fileName
	 * @return
	 */
	boolean createEmptyFile(String patest, String fileName);

	/**
	 * @param pathSource
	 * @param pathDest
	 * @return
	 */
	boolean downloadFile(String pathSource, String pathDest);

	/**
	 * @param pathSource
	 * @param pathDest
	 * @return
	 */
	boolean uploadFile(String pathSource, String pathDest);

	/**
	 * @param path
	 * @param fileName
	 * @param numberOfFiles
	 * @return
	 */
	boolean createMultipleFiles(String path, String fileName, int numberOfFiles);

	/**
	 * @param pathDest
	 * @param files
	 * @param metaDataFiles
	 * @return
	 */
	boolean uploadMultipleFiles(String pathDest, List<File> files, List<File> metaDataFiles);

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
	 * @param archivePath
	 * @param destPath
	 * @return
	 */
	boolean uploadArchive(String archivePath, String destPath);

	/**
	 * @param archiveName
	 * @param destPath
	 * @param filesToArchive
	 * @return
	 */
	boolean uploadFilesAsArchive(String archiveName, String destPath, List<File> filesToArchive);

	/**
	 * @param extension
	 */
	void setForbiddenExtension(String extension);

}

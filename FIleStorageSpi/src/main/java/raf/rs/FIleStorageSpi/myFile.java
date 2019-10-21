package raf.rs.FIleStorageSpi;

public interface myFile {

	boolean delFile(String path);

	boolean createEmptyFile(String path, String fileName);

	boolean downloadFile(String path, String fileName);

	boolean uploadFile(String path, String fileName);

	boolean createMultipleFiles(String path,String fileName,int numberOfFiles);
}

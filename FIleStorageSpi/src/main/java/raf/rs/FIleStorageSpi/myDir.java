package raf.rs.FIleStorageSpi;

import java.io.File;

public interface myDir {
	
	boolean initFileStorage(StorageUser creator, String path, String rootDirName);

	File searchDirectory(String dirPath, String searchFor);
}

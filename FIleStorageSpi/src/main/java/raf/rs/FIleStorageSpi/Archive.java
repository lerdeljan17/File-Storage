package raf.rs.FIleStorageSpi;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.zeroturnaround.zip.ZipUtil;

import exceptions.CreateException;
import exceptions.CustomException;
import exceptions.NotFoundException;

public class Archive {
	/**
	 * Metoda koja arhivira listu prosledjenih fajlova. Ukoliko je neuspesno baca Exception-e.
	 * @param archiveName - Ime arhive, ukoliko se ne navede ili je blanko ili null, arhiva ce imati naziv isti kao direktorijum u kome se nalaze fajlovi
	 * @param destPath - Putanja na koju zelimo da smestimo arhivu
	 * @param filesToArchive - Lista fajlova koje zelimo da arhiviramo
	 * @return
	 */
	public static boolean uploadFilesAsArchive(String archiveName, String destPath, List<File> filesToArchive)
			throws Exception {
		if(filesToArchive.isEmpty()) {
			throw new CreateException("Nije prosledjen nijedan fajl za arhivirati!");
		}
		
		String parentPath = filesToArchive.get(0).getParent();
		for(int i = 1; i < filesToArchive.size(); i++) {
			String currentParentPath = filesToArchive.get(i).getParent();
			if(!parentPath.equals(currentParentPath)) {
				throw new CustomException("Svi fajlovi koji se arhiviraju moraju biti u istom direktorijumu!");
			}
		}
		
		if(archiveName == null) {
			File parentFile = new File(parentPath);
			archiveName = parentFile.getName();
		}
		
		if(archiveName.isEmpty() || archiveName.isBlank()) {
			File parentFile = new File(parentPath);
			archiveName = parentFile.getName();
		}
		
		//System.out.println(archiveName);
		
		String destinationPath = FilenameUtils.separatorsToSystem(destPath + "\\" + "tempArhive");
		File newDirectory = new File(destinationPath);
		if (!newDirectory.exists()) {
			//System.out.println(dir.toString());
			if (newDirectory.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				throw new CreateException();
			}
		} else {
			
		}
		
		for(File f : filesToArchive) {
			if(!f.exists()) {
				throw new NotFoundException(f.getName());
			}
			
			if(f.isFile()) {
				FileUtils.copyFileToDirectory(f, newDirectory);
			} else if(f.isDirectory()) {
				FileUtils.copyDirectoryToDirectory(f, newDirectory);
			}
			
		}
		
		String arhivePath = FilenameUtils.separatorsToSystem(destPath + "\\" + archiveName +  ".zip");
		File arhiveFile = new File(arhivePath);
		if(arhiveFile.exists()) {
			FileUtils.deleteDirectory(newDirectory);
			throw new CustomException("Vec postoji folder sa imenom " + archiveName + ".zip!");
		}
		
		ZipUtil.pack(newDirectory, arhiveFile);
		
		FileUtils.deleteDirectory(newDirectory);
		
		return true;
	}
}

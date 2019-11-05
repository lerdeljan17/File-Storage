package raf.rs.FIleStorageSpi;

public interface FileStorage {
	/**
	 * @param rootDir
	 * @param name
	 * @param rootUser
	 * @return
	 */
	boolean initFileStorage(MyDir rootDir,String name,User rootUser);

	/**
	 * Metoda koja prosiruje listu zabranjenih ekstanzija prosledjenom ekstanzijom.
	 * @param extension - ekstanzija
	 */
	/**
	 * @param extension
	 */
	void setForbiddenExtension(String extension);
	
	/**
	 * @param user
	 * @return
	 */
	boolean openConnectionWithUser(User user)throws Exception;
	
	boolean closeConnectionWithUser(User user);
}

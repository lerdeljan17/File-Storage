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
	/**
	 * Metoda koja uspostavlja konekciju izmedju skladista i korisnika
	 * @param user
	 * @return
	 * @throws Exception ako korisnik koji se loguje nije registrovan u skladistu
	 */
	boolean openConnectionWithUser(User user)throws Exception;
	
	/**
	 * Metoda koja zatvara konekciju izmedju skladista i korisnika i pritom popunjava metadata fajl za skladiste sa korisnicima
	 * @param user
	 * @return
	 */
	boolean closeConnectionWithUser(User user);
}

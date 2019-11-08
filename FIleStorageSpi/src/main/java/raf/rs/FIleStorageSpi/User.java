package raf.rs.FIleStorageSpi;

import java.io.File;
import java.util.ArrayList;

/**
 * @author subot
 *
 */
public class User {
	
	private String username;
	private String password;
	//private FileStorage storage;
	//TODO kako razresiti user - filestorage
	
	private ArrayList<PrivilageType> privilages;
	
	private boolean isRootUser;
	
	/**
	 * Konstruktor koji se koristi prilikom parsiranja JSON File-a
	 * @param username
	 * @param password
	 * @param isRootUser
	 * @param privilages
	 */	
	public User(String username, String password, boolean isRootUser, ArrayList<PrivilageType> privilages) {
		super();
		this.username = username;
		this.password = password;
		this.privilages = privilages;
		this.isRootUser = isRootUser;
	}

	
	/**
	 * Konstruktor koji se koristi kada admin pravi usere
	 * @param username
	 * @param password
	 */
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.isRootUser = false;
		this.privilages = new ArrayList<PrivilageType>();
		this.privilages.add(PrivilageType.DOWNLOAD);
		this.privilages.add(PrivilageType.READ);
	}

	public User createNewUser(User user, String username, String password) {
		return null;
	}

	public void revokePrivilage(User revokeFromUser, PrivilageType privilage) throws Exception {

	}
	
	public void addPrivilage(User user, PrivilageType privilage) throws Exception {
		
	}

	public boolean connectToFileStorage(String rootPath) throws Exception {
		return false;
	}

	public boolean disconnectFromFileStorage(String rootPath) throws Exception {
		return false;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<PrivilageType> getPrivilages() {
		return privilages;
	}

	public void setPrivilages(ArrayList<PrivilageType> privilages) {
		this.privilages = privilages;
	}

	public boolean isRootUser() {
		return isRootUser;
	}

	public void setRootUser(boolean isRootUser) {
		this.isRootUser = isRootUser;
	}
	
//	public FileStorage getStorage() {
//		return storage;
//	}
//	
//	public void setStorage(FileStorage storage) {
//		this.storage = storage;
//	}

	@Override
	public String toString() {
		return this.username + " " + this.password + " " + this.privilages.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (obj instanceof User) {
			User tmpUser = (User) obj;
			if (this.username.equals(tmpUser.getUsername()))
				return true;
		} else {
			return false;
		}
		
		return super.equals(obj);
	}
}

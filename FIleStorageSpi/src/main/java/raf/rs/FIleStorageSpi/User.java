package raf.rs.FIleStorageSpi;

import java.io.File;
import java.util.ArrayList;

public class User {
	
	private String username;
	private String password;
	
	private ArrayList<String> privilages;
	
	private boolean isRootUser;

	public User(String username, String password, boolean isRootUser, ArrayList<String> privilages) {
		super();
		this.username = username;
		this.password = password;
		this.privilages = privilages;
		this.isRootUser = isRootUser;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.privilages = new ArrayList<String>();
		this.privilages.add("add");
		this.privilages.add("del");
		this.privilages.add("read");
	}

	public boolean createNewUser(String username, String password) {

		return false;
	}

	public void revokePrivilage(User revokeFromUser, String privilage) throws Exception {

	}

	public boolean connectToFileStorage(String rootDirPath, String FileStorageRootDirName) throws Exception {
		return false;
	}

	public boolean disconnectFromFileStorage(String fileStorageRootDir) {
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

	public ArrayList<String> getPrivilages() {
		return privilages;
	}

	public void setPrivilages(ArrayList<String> privilages) {
		this.privilages = privilages;
	}

	public boolean isRootUser() {
		return isRootUser;
	}

	public void setRootUser(boolean isRootUser) {
		this.isRootUser = isRootUser;
	}

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

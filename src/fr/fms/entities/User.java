package fr.fms.entities;

import java.util.ArrayList;

public class User {

	private int idUser;
	private String firstNameUser;
	private String lastNameUser;
	private String mailUser;
	private User user;
	private ArrayList<Account> listAccounts;
	
	public User(int idUser, String firstNameUser, String lastNameUser, String mailUser) {
		this.idUser = idUser;
		this.firstNameUser = firstNameUser;
		this.lastNameUser = lastNameUser;
		this.mailUser = mailUser;
		this.listAccounts = new ArrayList<Account>();
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setListAccounts(ArrayList<Account> listAccounts) {
		this.listAccounts = listAccounts;
	}

	public ArrayList<Account> getListAccounts() {
		return listAccounts;
	}
	
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFirstNameUser() {
		return firstNameUser;
	}

	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}

	public String getLastNameUser() {
		return lastNameUser;
	}

	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	} 
	
	
	public String toString() {
		
		 return String.format("accountId: %s, firstname: %s, lastname: %s, email: %s", idUser, firstNameUser, lastNameUser, mailUser);
	}
	
	
}

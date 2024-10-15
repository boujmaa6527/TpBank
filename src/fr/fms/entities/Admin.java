package fr.fms.entities;

public class Admin extends User{

	public Admin(int idUser, String firstNameUser, String lastNameUser, String mailUser) {
		super(idUser, firstNameUser, lastNameUser, mailUser);
	}

	public User createUser(int idUser, String firstNameUser, String lastNameUser, String mailUser) {
		
		return new User(idUser, firstNameUser,lastNameUser, mailUser); 
	}

	
	
	

	

	
}

package fr.fms.entities;
import java.util.Date;

import fr.fms.entities.User;
public  class SavingAccount extends Account {

	// taux d'intéret
	private double interestRate;
	private User user; 
	
	
	// Contructeur
	public SavingAccount(int idAccount, Date dateCreateAcount, double balanceAcount, double interestRate, User user) {
		super(idAccount,  dateCreateAcount, balanceAcount);
		this.interestRate =  interestRate;
		this.user = user; 
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public String toString() {
		
		return String.format("IdAcount: %s, Date de creation: %s, balance: %f, %f, %s", getIdAccount(),
																						getDateCreateAcount(),
																						getBalanceAcount(),
																						getInterestRate(), 
																						getUser().toString());
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	

	
}

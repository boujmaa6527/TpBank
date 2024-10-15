package fr.fms.entities;
import java.util.Date;

import fr.fms.entities.User;
public  class SavingAccount extends Account {

	// taux d'intéret
	private double interestRate;
	
	
	// Contructeur
	public SavingAccount() {
		
	}

	public SavingAccount(int idAccount, Date dateCreateAcount, double balanceAcount, User user) {
		super(idAccount, dateCreateAcount, balanceAcount, user);
		
	}

	public SavingAccount(int idAccount, double balanceAcount) {
		super(idAccount, balanceAcount);
		
	}
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public String toString() {
		return "Saving Account "+ super.toString()+ ",\n\t\t interestRate="+interestRate + "]"; 
	}

	

	

	
	

	
}

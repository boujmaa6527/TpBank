package fr.fms.entities;
import java.util.Date;

import fr.fms.entities.User;
public class CurrentAccount extends Account{

	private double amountAutorize = 200;
	private User user; 
	
	
	
	public CurrentAccount(int idAccount, Date dateCreateAcount, double balanceAcount, double amountAutorize, User user) {
		super(idAccount, dateCreateAcount, balanceAcount);
		this.amountAutorize = amountAutorize; 
		this.user = user; 
		
	}
	
	
	public double getAmountAutorize() {
		return amountAutorize;
	}
	public void setAmountAutorize(double amountAutorize) {
		this.amountAutorize = amountAutorize;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String toString() {
		
		return String.format("IdCount= %s, Date de creation= %s, balance= %,f, %f, %s",getIdAccount(),
																				getDateCreateAcount(),
																				getBalanceAcount(),
																				getAmountAutorize(),
																				getUser().toString());
																				
	}
//	@Override
//	public void withdraw(double withdrawAmount) {
//		if(getBalanceAcount() - withdrawAmount < amountAutorize) {
//			System.out.println("Découvert dépassé");
//		}
//		setBalanceAcount(getBalanceAcount() - withdrawAmount);
//	}
	// fonction découvert autorisé
	public boolean isOverdraftAllowed(int amount) {
		if(getBalanceAcount() - amount  < -amount ) {
			System.out.println("Découvert dépassé");
			return false;
		}
		return true;
	}
	

}

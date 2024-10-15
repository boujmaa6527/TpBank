package fr.fms.entities;
import java.util.Date;

import fr.fms.entities.User;
public class CurrentAccount extends Account{

	private double amountAutorize;
	
	public CurrentAccount(int idAccount, Date dateCreateAcount, double balanceAcount, User user) {
		super(idAccount, dateCreateAcount, balanceAcount, user);
		this.amountAutorize = amountAutorize;
	}
	
	public double getAmountAutorize() {
		return amountAutorize;
	}
	public void setAmountAutorize(double amountAutorize) {
		this.amountAutorize = amountAutorize;
	}
	
	

	@Override
	public String toString() {
		return "Current Account "+ super.toString()+ ",\n\t\t amountAutorize="+amountAutorize + "]"; 
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
//	public String toString() {
//	
////	return String.format("IdCount= %s, Date de creation= %s, balance= %,f, %f",getIdAccount(),
////																			getDateCreateAcount(),
////																			getBalanceAcount(),
////																			getAmountAutorize()
////																			);
////																			
////	}

}

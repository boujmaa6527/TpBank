package fr.fms.entities;

import java.util.Date;

public class Withdrawal extends Transaction{

	public Withdrawal(long idTransaction, Date transactionDate, double amount, long accountId) {
		super(idTransaction, transactionDate, amount, accountId);
		
	}
	@Override
	public String toString() {
		return "Retrait: "+ super.toString();
	}

}

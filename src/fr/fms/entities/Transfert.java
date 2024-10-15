package fr.fms.entities;

import java.util.Date;

public class Transfert extends Transaction{

	public Transfert(long idTransaction, Date transactionDate, double amount, long accountId) {
		super(idTransaction, transactionDate, amount, accountId);
		
	}
	
	@Override
	public String toString() {
		return "Versement:"+super.toString();
	}

}

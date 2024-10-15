package fr.fms.business;

import java.util.ArrayList;

import fr.fms.entities.Account;
import fr.fms.entities.Transaction;

public  interface Ibank {
	
		public void addAccount(Account amount);
		public Account consultAccount(long accountId);
		public void pay(long accountId, double amount);
		public boolean  withdraw(long accoundId, double amount); 
		public void transfert(long accountIdSrc, long accountIdDest, double amount);
		public ArrayList<Transaction> listTransaction(long accountId); 
		

}

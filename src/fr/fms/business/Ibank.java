package fr.fms.business;

import fr.fms.entities.Account;

public  interface Ibank {
	
		public void addAccount(Account amount);
		public Account consultAccount(long accountId);
		public void pay(long accountId, double amount);
		public boolean  withdraw(long accoundId, double amount); 
		public void transfert(long accountIdSrc, long accountIdDest, double amount);
		
	

}

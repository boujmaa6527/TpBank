package fr.fms.business;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.fms.entities.Account;

public  class Ibanklmpl implements Ibank {

	
	private HashMap<Integer, Account> accounts;
	// Constructeur
	
	public Ibanklmpl() {
		this.accounts = new HashMap<>();
	}
	// ajouter un compte
	public void addAccount(Account account) {
		accounts.put(account.getIdAccount(), account);
	}

	// renvoie le compte correspondant à l'id sur une HashMap avec keySet pour la value
	public Account consultAccount(long accountId) {
		// On instantie un objet de la classe Account avec un constructeur vide
			Account account = accounts.get(accountId);
			for(int i : accounts.keySet()) {
				if(i == accountId) {
					
					account = accounts.get(i);
					
					}
				
				}
			//Si le compte n'existe pas mais impossible de retirer null car objet account est null
			if(account == null) {
				System.out.print("Compte Non trouvé donc : ");
				
			}
			
		
		return account;
	}
	
	//faire un versement sur un compte
	public void pay(long accountId, double amount) {
		Account account = accounts.get(accountId);
		// KeySet recupère la key des HashMap et apres on compare ave l'id paramètre
		
			for(int i : accounts.keySet()) {
				if(i == accountId) {	
					account = accounts.get(i);
					if(account != null) {
					account.setBalanceAcount(account.getBalanceAcount() + amount);
					}	
					
				} 
			}// Si le compte n'existe pas 
			if(account == null) {
				System.out.print("Compte Non trouvé ! ");
				
			}
		
		
	};
	//faire un retrait sur un compte
	public boolean withdraw(long accountId, double amount) {
		
		boolean iSwithdraw = false; 
		Account account = accounts.get(accountId);
		// keySet recupère la key des HashMap
		for(int i : accounts.keySet()) {
			if(i == accountId) {
				
				// on onvoie la value de la HashMap dans l'objet account
				account = accounts.get(i);
				//check s'il y a du flousse et si le montant du compte est > au montant du retrait
				if(account.getBalanceAcount() > 0 && amount < account.getBalanceAcount()) {
					account.setBalanceAcount(account.getBalanceAcount() - amount);
					iSwithdraw = true; 
				}
				// Si retrait > au montant du compte
				if(!iSwithdraw) {
					System.out.println("Retrait Non autorisé ");
				}
			}
			
		}
		if(account == null) {
			System.out.print("Compte Non trouvé pour le retrait! ");
			
		}
		
		return iSwithdraw;
		
	};
	
	public void transfert(long accIdSrc, long accIdDest, double amount) {
		Account account = accounts.get(accIdSrc);
		Account account1 = accounts.get(accIdDest);
		for(int i : accounts.keySet()) {
			if(i == accIdSrc) {
				account = accounts.get(i);
				//System.out.println(account);
				// retrait du compte sources 
				account.setBalanceAcount(account.getBalanceAcount() - amount); 
			}
			if(i == accIdDest) {
				account1 = accounts.get(i);
				//System.out.println(account1);
				// rajouter au compte destinataire
				account1.setBalanceAcount(account1.getBalanceAcount() + amount);
				
			}
			
			
			
		}
		if(account == null || account1 == null) {
			System.out.print("Compte Non trouvé pour le transfert! ");
			
		}
	};
	
	
	
	
	

	
	
}

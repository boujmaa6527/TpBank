package fr.fms.business;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import fr.fms.entities.Account;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.Transaction;
import fr.fms.entities.Transfert;
import fr.fms.entities.User;
import fr.fms.entities.Withdrawal;

public  class Ibanklmpl implements Ibank {

	
	private HashMap<Integer, Account> accounts;
	private HashMap<Integer, User> users;
	
	//compteur
	private long numTransaction;
	// Constructeur
	
	public Ibanklmpl() {
		accounts = new HashMap<Integer, Account>(); 
		users = new HashMap<Integer, User>(); 
		numTransaction = 1;
	}
	// ajouter un compte
	public void addAccount(Account account) {
		accounts.put(account.getIdAccount(), account);
		User user = account.getUser();
		users.put(user.getIdUser(), user); //rajoute a la liste dec lient s'il n'existe pas
		
		addAccountToUser(user, account); // ajoute au client son nouvea compte s'il n'existe pas
	}

	// methode qui vérifie si un compte exist
	public Account consultAccount(long accountId) {
		// On instantie un objet de la classe Account avec un constructeur vide
			Account account = accounts.get(accountId);
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
				if(account != null) {
					account.setBalanceAcount(account.getBalanceAcount() + amount);
					Transaction transaction = new Transfert(numTransaction++, new Date(), amount, accountId);
			}	
					
		
		
	};
	//faire un retrait sur un compte
	public boolean withdraw(long accountId, double amount) {
		
		int amountAutorize = 200;
		boolean iSwithdraw = false; 
		
		Account account = accounts.get(accountId);
		// keySet recupère la key des HashMap
		if(account != null) {
				//check s'il y a du flousse et si le montant du compte + le découvert est > au montant du retrait
				double capacity = 0;
				if(account instanceof CurrentAccount) {
					capacity = account.getBalanceAcount() +((CurrentAccount)account).getAmountAutorize();//solde + découver autorisé
				}else capacity = account.getBalanceAcount();
				
				if(amount <= capacity) {
					account.setBalanceAcount(account.getBalanceAcount() - amount);
					Transaction transaction = new Withdrawal(numTransaction++, new Date(), amount, accountId);
					account.getListTransaction().add(transaction);
				}else {
					System.out.println("vous avez dépassé vos capacités de retrait !");
					return false;
				}
				
//				if(account.getBalanceAcount() + amountAutorize >= amount ) {
//						account.setBalanceAcount(account.getBalanceAcount() - amount);
//						iSwithdraw = true; 
//				}
//				// Si retrait > au montant du compte + découvert
//				if(!iSwithdraw) {
//					System.out.println("Retrait Non autorisé ");
//				}
			
			}else return false; //compte inexistant -> retrait impossible
		
		return true; // retrait effectué
		
	};
	
	public void transfert(long accIdSrc, long accIdDest, double amount) {
		Account account = accounts.get(accIdSrc);
		Account account1 = accounts.get(accIdDest);
		int amountAutorize = 200;
		boolean iSwithdraw = false; 
		for(int i : accounts.keySet()) {
			if(i == accIdSrc) {
				account = accounts.get(i);
				//System.out.println(account);
				// retrait du compte sources 
				if(account.getBalanceAcount() + amountAutorize >= amount ) {
					account.setBalanceAcount(account.getBalanceAcount() - amount);
					iSwithdraw = true; 
				}
				if(!iSwithdraw) {
					System.out.println("Virement Non autorisé ");
				}
			}
			if(i == accIdDest) {
				account1 = accounts.get(i);
				
				//System.out.println(account1);
				// rajouter au compte destinataire et si l'argent a été retirer du compte sources
					//if(iSwithdraw) {
						account1.setBalanceAcount(account1.getBalanceAcount() + amount);
						System.out.println("Virement effectué avec succes!  ");
					
						
			}
				
		}
		if(account == null || account1 == null) {
			System.out.print("Compte Non trouvé pour le transfert! ");
			
		}
	};
	//renvoie la liste des transaction sur un compte
	@Override
	public ArrayList<Transaction> listTransaction(long accountId){
		return consultAccount(accountId).getListTransaction();
	}
	
	//renvoie la liste des compte  de notre banque
	public ArrayList<Account> listAccounts(){
		return new ArrayList<Account>(accounts.values());
	}
	
	//Ajout un compte à l'objet client grace à la liste de compte dans la class user
	private void addAccountToUser(User user,Account account ) {
		boolean exist = false; 
		for(Account acc: user.getListAccounts()) {
			if(acc.getIdAccount() == account.getIdAccount()) {
				exist = true; 
				break; 
			}
		}
		//si le compte n'existe pas on l'ajoute a la liste
		if(exist == false){
			user.getListAccounts().add(account);
		}
	}
	
	
	
	
	

	
	
}

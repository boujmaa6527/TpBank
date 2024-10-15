package fr.fms.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public  class Account {

	private int idAccount;
	protected double balanceAcount;
	private Date dateCreateAcount; 
	private User user;
	//variable d'instance constante 
	static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	
	//list des transaction compte courant ou compte épargne
	private ArrayList<Transaction> listTransaction; 
	
	
	public Account(int idAccount, Date dateCreateAcount, double balanceAcount, User user) {
		this.idAccount = idAccount;
		this.dateCreateAcount = dateCreateAcount; 
		this.balanceAcount = balanceAcount;
		//todo: gestion du cas particulier de client non instancié
		this.user = user;
		this.user.getListAccounts().add(this);//lorsque j'ajoute un compte à un client
												// j'ajoute à la liste de comptes ce nouveau compte
		
		
		
		this.listTransaction = new ArrayList<Transaction>();
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ArrayList<Transaction> getListTransaction() {
		return listTransaction;
	}
	
	public Account() {};
	public Date getDateCreateAcount() {
		return dateCreateAcount;
	}
	public void setDateCreateAcount(Date dateCreateAcount) {
		this.dateCreateAcount = dateCreateAcount;
	}
	public Account(int idAccount, double balanceAcount) {
		this.idAccount = idAccount;
		this.balanceAcount = balanceAcount;
	}
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	
	
	public double getBalanceAcount() {
		return balanceAcount;
	}
	public void setBalanceAcount(double balanceAcount) {
		this.balanceAcount = balanceAcount;
	}
	
	@Override
	public String toString() {
		return "[accountId="+idAccount+", creationDate="+ SIMPLE_DATE_FORMAT.format(dateCreateAcount)+", balance=" +balanceAcount+", \n\t"+user; 
	}
	
	
}
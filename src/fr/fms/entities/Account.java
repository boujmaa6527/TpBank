package fr.fms.entities;

import java.util.ArrayList;
import java.util.Date;

public  class Account {

	private int idAccount;
	protected double balanceAcount;
	private Date dateCreateAcount; 
	public ArrayList<Account> listCount; 
	
	public Account(int idAccount, Date dateCreateAcount, double balanceAcount) {
		this.idAccount = idAccount;
		this.dateCreateAcount = dateCreateAcount; 
		this.balanceAcount = balanceAcount;
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
	
	
	public void deposit(double amount) {
		this.balanceAcount += amount; 
	}
	public void displayAccount(int idAcount) {
		//Account acount = new Account();
		
		
		
	}
	
}
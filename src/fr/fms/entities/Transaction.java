package fr.fms.entities;

import java.util.ArrayList;
import java.util.Date;

public abstract class Transaction {
	
		private long idTransaction;
		private Date transactionDate;
		private double amount; 
		
		private long accountId;
		
		

		public Transaction(long idTransaction, Date transactionDate, double amount, long accountId) {
			this.idTransaction = idTransaction;
			transactionDate = transactionDate;
			this.amount = amount;
			this.accountId = accountId;
		}

		public long getIdTransaction() {
			return idTransaction;
		}

		public void setIdTransaction(long idTransaction) {
			this.idTransaction = idTransaction;
		}

		public Date getTransactionDate() {
			return transactionDate;
		}

		public void setTransactionDate(Date transactionDate) {
			transactionDate = transactionDate;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmout(double amount) {
			this.amount = amount;
		}

		public long getAccountId() {
			return accountId;
		}

		public void setAccountId(long accountId) {
			this.accountId = accountId;
		}
		@Override
		public String toString() {
			return "Transaction [idTransaction="+ idTransaction+ ", transactionDate="+ Account.SIMPLE_DATE_FORMAT.format(transactionDate)+", amount="+amount+", accoundId="+accountId+"]";		}
		
		
}

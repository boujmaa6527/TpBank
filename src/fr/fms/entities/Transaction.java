package fr.fms.entities;

import java.util.ArrayList;

public class Transaction {
	
		private int counterTransaction; 
		private int idTransaction;
		ArrayList<Transaction> listTransaction = new ArrayList<>(); 
		
		public Transaction(int counterTransaction, int idTransaction) {
			
			this.counterTransaction++; 
			this.idTransaction = counterTransaction;
		}

		public int getCounterTransaction() {
			return counterTransaction;
		}

		public void setCounterTransaction(int counterTransaction) {
			this.counterTransaction = counterTransaction;
		}

		public int getIdTransaction() {
			return idTransaction;
		}

		public void setIdTransaction(int idTransaction) {
			this.idTransaction = idTransaction;
		} 
		
		public String toString() {
			
			return "Transaction n° "+ getIdTransaction();
			
		}
		
		
}

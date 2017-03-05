package model; 
public class Account    { 
	 
	 
		private int id; 
	 
		private User user; 
	 
		private String accountName; 
	 
		private double balance; 
	 
		private java.util.List<Transaction> transactions; 
	 
	 
		public final int getId() {
			return this.id;
		} 
		public final void setId(final int someId) {
			this.id = someId;
		} 
	 
		public final User getUser() {
			return this.user;
		} 
		public final void setUser(final User someUser) {
			this.user = someUser;
		} 
	 
		public final String getAccountName() {
			return this.accountName;
		} 
		public final void setAccountName(final String someAccountName) {
			this.accountName = someAccountName;
		} 
	 
		public final double getBalance() {
			return this.balance;
		} 
		public final void setBalance(final double someBalance) {
			this.balance = someBalance;
		} 
	 
		public final java.util.List<Transaction> getTransactions() {
			return this.transactions;
		}  
	 
} 
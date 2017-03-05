package model;
import java.util.List;
import controller.IController;

public class Transaction   implements IModel { 
	 
	 
		private int id; 
	 
		private Account account; 
	 
		private Date transactionDate; 
	 
		private List<Stock> stocks; 
	 
	 
		public final int getId() {
			return this.id;
		} 
		public final void setId(final int someId) {
			this.id = someId;
		} 
	 
		public final Account getAccount() {
			return this.account;
		} 
		public final void setAccount(final Account someAccount) {
			this.account = someAccount;
		} 
	 
		public final Date getTransactionDate() {
			return this.transactionDate;
		} 
		public final void setTransactionDate(final Date someTransactionDate) {
			this.transactionDate = someTransactionDate;
		} 
	 
		public final  List<Stock> getStocks() {
			return this.stocks;
		} 
		public final void setStocks(final List<Stock> someStocks) {
			this.stocks = someStocks;
		} 
	 
		public final void set(final Account some) {
			this.account = some;
		}
		@Override
		public IController getController() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public void setController(IController some) {
			// TODO Auto-generated method stub
			
		} 
	 
} 
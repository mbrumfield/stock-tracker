package view;

import controller.IController;

public class TransactionHistoryView   implements IView { 
	 
	 
		private TableView transactionList; 
	 
		private HomeView homeView; 
	 
	 
		public final TableView getTransactionList() {
			return this.transactionList;
		} 
		public final void setTransactionList(final TableView someTransactionList) {
			this.transactionList = someTransactionList;
		} 
	 
		public final HomeView get() {
			return this.homeView;
		} 
		public final void set(final HomeView some) {
			this.homeView = some;
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
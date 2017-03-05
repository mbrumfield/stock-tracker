package view;

import controller.IController;

public class StockDetailsView   implements IView { 
	 
	 
		private TableView stockDetail; 
	 
		private HomeView homeView; 
	 
	 
		public final TableView getStockDetail() {
			return this.stockDetail;
		} 
		public final void setStockDetail(final TableView someStockDetail) {
			this.stockDetail = someStockDetail;
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
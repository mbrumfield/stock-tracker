package view;

import controller.IController;

public class PorfolioView   implements IView { 
	 
	 
		private TableView portfolio; 
	 
		private HomeView homeView; 
	 
	 
		public final TableView getPortfolio() {
			return this.portfolio;
		} 
		public final void setPortfolio(final TableView somePortfolio) {
			this.portfolio = somePortfolio;
		} 
	 
		public final HomeView getHomeView() {
			return this.homeView;
		} 
		public final void setHomeView(final HomeView some) {
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
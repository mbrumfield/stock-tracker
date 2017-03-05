package view;

import controller.IController;

public class SettingsView   implements IView { 
	 
	 
		private TextField newPassword; 
	 
		private TextField confirmPassword; 
	 
		private TextField balance; 
	 
		private HomeView homeView; 
	 
	 
		public final TextField getNewPassword() {
			return this.newPassword;
		} 
		public final void setNewPassword(final TextField someNewPassword) {
			this.newPassword = someNewPassword;
		} 
	 
		public final TextField getConfirmPassword() {
			return this.confirmPassword;
		} 
		public final void setConfirmPassword(final TextField someConfirmPassword) {
			this.confirmPassword = someConfirmPassword;
		} 
	 
		public final TextField getBalance() {
			return this.balance;
		} 
		public final void setBalance(final TextField someBalance) {
			this.balance = someBalance;
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
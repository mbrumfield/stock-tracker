package view;

import controller.IController;

public class ResetPasswordView   implements IView { 
	 
	 
		private TextField password; 
	 
		private TextField confirmPassword; 
	 
		private LoginView loginView; 
	 
	 
	 
		public final TextField getPassword() {
			return this.password;
		} 
		public final void setPassword(final TextField somePassword) {
			this.password = somePassword;
		} 
	 
		public final TextField getConfirmPassword() {
			return this.confirmPassword;
		} 
		public final void setConfirmPassword(final TextField someConfirmPassword) {
			this.confirmPassword = someConfirmPassword;
		} 
	 
		public final LoginView getLoginView() {
			return this.loginView;
		} 
		public final void setLoginView(final LoginView some) {
			this.loginView = some;
		} 

		@Override
		public void setController(IController some) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public IController getController() {
			// TODO Auto-generated method stub
			return null;
		} 
	 
} 
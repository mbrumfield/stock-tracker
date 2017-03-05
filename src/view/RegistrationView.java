package view;

import controller.IController;

public class RegistrationView   implements IView { 
	 
	 
		private TextField username; 
	 
		private TextField password; 
	 
		private TextField email; 
	 
		private LoginView loginView; 
	  
	 
	 
		public final TextField getUsername() {
			return this.username;
		} 
		public final void setUsername(final TextField someUsername) {
			this.username = someUsername;
		} 
	 
		public final TextField getPassword() {
			return this.password;
		} 
		public final void setPassword(final TextField somePassword) {
			this.password = somePassword;
		} 
	 
		public final TextField getEmail() {
			return this.email;
		} 
		public final void setEmail(final TextField someEmail) {
			this.email = someEmail;
		} 
	 
		public final LoginView getLoginView() {
			return this.loginView;
		} 
		public final void setLoginView(final LoginView some) {
			this.loginView = some;
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
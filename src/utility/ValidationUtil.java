package utility; 
import controller.*;
public class ValidationUtil    { 
	 
	 
		private RegistrationController registrationController; 
	 
		private LoginController loginController; 
	 
	 
		public final RegistrationController getRegistrationController() {
			return this.registrationController;
		} 
		public final void setRegistrationController(final RegistrationController some) {
			this.registrationController = some;
		} 
	 
		public final LoginController getLoginController() {
			return this.loginController;
		} 
		public final void setLoginController(final LoginController some) {
			this.loginController = some;
		} 
	 
} 
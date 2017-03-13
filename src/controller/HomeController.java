package controller; 
import utility.*;
import model.*;
import view.*;
public class HomeController  implements IController { 
		private BackgroundService bckgrnSer = null; 
	 
		private CommonUtil comUtil = null;
		private User user;
		
		
		public void switchContext(User user)
		{
			this.user = user;
			HomeView view = new HomeView();
			view.start();
		}
	 
} 
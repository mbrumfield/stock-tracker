package controller; 
import utility.*;
import model.*;
import view.*;
public class HomeController  extends IController { 
		private BackgroundService bckgrnSer = null; 
		
		private CommonUtil comUtil = null;
		private SearchStockController ssCont;
		private String userName;
		
		public void switchContext(User user)
		{
			ssCont = new SearchStockController();
			System.out.println(user.getUsername());
			setUser(user);
			HomeView view = new HomeView();
			view.start(this);
		}
		
		
	


		public void switchToSearchContext()
		{
			ssCont.switchContext();
		}
	 
} 
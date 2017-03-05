package controller; 
import utility.*;
import view.ActionEvent;
public class RegistrationController  implements IController { 
	 
	 
	private ValidationUtil validationUtil; 
	 
	private DatabaseUtil databaseUtil; 
		
		
	public boolean register(ActionEvent event)
	{
		boolean sucessfulReg = DatabaseUtil.registerInDatabase(event);
		if(sucessfulReg)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
} 
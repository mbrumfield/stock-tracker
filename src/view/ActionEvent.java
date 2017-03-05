package view;


public class ActionEvent 
{
	public enum ActionType {
	    REGISTER,
	    LOGIN
	}
	
	public ActionType action;
	public String username;
	public String password;
}

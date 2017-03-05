package controller; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import utility.*;
import view.ActionEvent;
public class LoginController  implements IController { 
	 
	 
		private ValidationUtil valUtil; 
	 
		private DatabaseUtil databaseUtil; 
	 
	 public void login(ActionEvent event) throws SQLException
	 {
		 boolean logOn = DatabaseUtil.canLogOn(event);
		 if(logOn)
		 {
			 JOptionPane.showMessageDialog(null,"Logged In");
		 }
		 else
		 {
			 JOptionPane.showMessageDialog(null,"Not Found");
		 }
	 }
} 
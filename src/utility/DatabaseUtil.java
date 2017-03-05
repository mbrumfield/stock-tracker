package utility; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.*;
import view.ActionEvent;
public class DatabaseUtil    { 
	 
	 
		private StockDetailsController stockDetailsController; 
	 
		private RegistrationController registrationController; 
	 
		private LoginController loginController; 
		
		
	    public static Connection dbconnection()
	    {
	    	try{
	    		
	    		Class.forName("org.sqlite.JDBC");
		
	    		Connection Call = DriverManager.getConnection("jdbc:sqlite:" + CommonUtil.getAbsolutePathOfFile("StockTracker.sqlite"));
	    		return Call;
	    		
	    	}catch(Exception e ){
	    		
	    		JOptionPane.showMessageDialog(null, "Disconnected");
	    		return null;
	    	}
	    }
	    
	    public static boolean canLogOn(ActionEvent event) throws SQLException
	    {
	    	Connection connection = dbconnection();
		    String query = "SELECT * FROM Users WHERE username = ? AND password = ?";
		    PreparedStatement pst = connection.prepareStatement(query);
		    pst.setString(1, event.username);
		    pst.setString(2, event.password);       // Sq lite
				
	        ResultSet rs = pst.executeQuery();
	        int count = 0;
	        while(rs.next())	count++;
		      rs.close();
		      pst.close();
	        if(count == 1)   
	        {
	        	return true;
	        }
	        
	        else            
	        {
	        return false;
	        }
	    }
	    public static boolean registerInDatabase(ActionEvent event)
	    {
			try{
				Connection connection = dbconnection();
			    String query = "INSERT INTO Users (username,password) VALUES (?,?)";
			    PreparedStatement pst = connection.prepareStatement(query);
			    pst.setString(1, event.username);
			    pst.setString(2, event.password); 
			    
			    	 pst.execute();
			    	 pst.close();
			    	 return true;
			    	 

			    
			}catch(Exception e1){   return false;     }
	    }
	 
	 
		public final StockDetailsController getStockDetailsController() {
			return this.stockDetailsController;
		} 
		public final void setStockDetailsController(final StockDetailsController some) {
			this.stockDetailsController = some;
		} 
	 
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
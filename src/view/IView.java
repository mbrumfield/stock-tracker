package view; 
import javax.swing.JFrame;
import controller.*;

import controller.*;
public interface IView  { 
	 
	 
		IController controller = new IController() {}; 
		
		JFrame frame = new JFrame();
	 
	 
		public IController getController();
		public void setController(final IController some);
} 
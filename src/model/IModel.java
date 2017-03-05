package model; 
import controller.IController;
public interface IModel  { 
	 
	 
		IController controller = null; 
	 
	 
		public IController getController();
		public void setController(IController some);
	 
} 
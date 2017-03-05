package utility; 
import java.io.File;

import controller.*;
public class CommonUtil    { 
	 
	 
		private HomeController homeController; 
	 
	 
		public final HomeController get() {
			return this.homeController;
		} 
		public final void set(final HomeController some) {
			this.homeController = some;
		} 
	 
		
		public static String getAbsolutePathOfFile(String file)
		{
			File dbFile = new File(file);
			String path = dbFile.getAbsolutePath();
			return path;
		}
} 
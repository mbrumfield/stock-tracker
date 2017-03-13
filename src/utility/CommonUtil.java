package utility; 
import java.io.File;
import java.io.IOException;

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
			String current = null;
			try {
				current = new java.io.File( "." ).getCanonicalPath();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("Current dir:"+current);
			File dbFile = new File(file);
			String path = dbFile.getAbsolutePath();
			return path;
		}
} 
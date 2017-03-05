package utility;
import controller.*;
public class BackgroundService    { 
	 
	 
		private HomeController homeController; 
	 
		private StockDetailsController stockDetailsController; 
	 
		private AlertSettingsController alertSettingController; 
	 
	 
		public final HomeController getHomeController() {
			return this.homeController;
		} 
		public final void setHomeController(final HomeController some) {
			this.homeController = some;
		} 
	 
		public final StockDetailsController getStockDetailsController() {
			return this.stockDetailsController;
		} 
		public final void setStockDetailsController(final StockDetailsController some) {
			this.stockDetailsController = some;
		} 
	 
		public final AlertSettingsController getAlertSettingsController() {
			return this.alertSettingController;
		} 
		public final void setAlertSettingsController(final AlertSettingsController some) {
			this.alertSettingController = some;
		} 
	 
} 
package model; 
public class Stock    { 
	 
	 
		private int id; 
	 
		private String stockCode; 
	 
		private String stockName; 
	 
		private double price; 
	 
		private double previousPrice; 
	 
		//private java.util.List<UserStock>  userStocks; note from Justin I don't know if this is needed 
	 
//		private java.util.List<UserStock> ; 
	 
	 
		public final int getId() {
			return this.id;
		} 
		public final void setId(final int someId) {
			this.id = someId;
		} 
	 
		public final String getStockCode() {
			return this.stockCode;
		} 
		public final void setStockCode(final String someStockCode) {
			this.stockCode = someStockCode;
		} 
	 
		public final String getStockName() {
			return this.stockName;
		} 
		public final void setStockName(final String someStockName) {
			this.stockName = someStockName;
		} 
	 
		public final double getPrice() {
			return this.price;
		} 
		public final void setPrice(final double somePrice) {
			this.price = somePrice;
		} 
	 
		public final double getPreviousPrice() {
			return this.previousPrice;
		} 
		public final void setPreviousPrice(final double somePreviousPrice) {
			this.previousPrice = somePreviousPrice;
		} 
	 
//		public final  getUserStocks() {
//			return this.userStocks;
//		} 
//		public final void setUserStocks(final  someUserStocks) {
//			this.userStocks = someUserStocks;
//		} 
//	 
//		public final java.util.List<UserStock> get() {
//			return this.;
//		} 
//		public final void set(final java.util.List<UserStock> some) {
//			this. = some;
//		} 
	 
} 
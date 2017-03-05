package model; 
public class UserStock    { 
	 
	 
		private int id; 
	 
		private User user; 
	 
		private Stock stock; 
	 
		private double valueThreshold; 
	 
		private double combinedValueThreshold; 
	 
		private double netProfitThreshold; 
	 
	 
		public final int getId() {
			return this.id;
		} 
		public final void setId(final int someId) {
			this.id = someId;
		} 
	 
		public final User getUser() {
			return this.user;
		} 
		public final void setUser(final User someUser) {
			this.user = someUser;
		} 
	 
		public final Stock getStock() {
			return this.stock;
		} 
		public final void setStock(final Stock someStock) {
			this.stock = someStock;
		} 
	 
		public final double getValueThreshold() {
			return this.valueThreshold;
		} 
		public final void setValueThreshold(final double someValueThreshold) {
			this.valueThreshold = someValueThreshold;
		} 
	 
		public final double getCombinedValueThreshold() {
			return this.combinedValueThreshold;
		} 
		public final void setCombinedValueThreshold(final double someCombinedValueThreshold) {
			this.combinedValueThreshold = someCombinedValueThreshold;
		} 
	 
		public final double getNetProfitThreshold() {
			return this.netProfitThreshold;
		} 
		public final void setNetProfitThreshold(final double someNetProfitThreshold) {
			this.netProfitThreshold = someNetProfitThreshold;
		} 
	 
} 
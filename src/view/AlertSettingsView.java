package view; 
import controller.*;
public class AlertSettingsView   implements IView { 
	 
	 
		private TextField valueThreshold; 
	 
		private TextField combinedValueThreshold; 
	 
		private TextField netProfitThreshold; 
	 
	 
		public final TextField getValueThreshold() {
			return this.valueThreshold;
		} 
		public final void setValueThreshold(final TextField someValueThreshold) {
			this.valueThreshold = someValueThreshold;
		} 
	 
		public final TextField getCombinedValueThreshold() {
			return this.combinedValueThreshold;
		} 
		public final void setCombinedValueThreshold(final TextField someCombinedValueThreshold) {
			this.combinedValueThreshold = someCombinedValueThreshold;
		} 
	 
		public final TextField getNetProfitThreshold() {
			return this.netProfitThreshold;
		} 
		public final void setNetProfitThreshold(final TextField someNetProfitThreshold) {
			this.netProfitThreshold = someNetProfitThreshold;
		}
		@Override
		public IController getController() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public void setController(IController some) {
			// TODO Auto-generated method stub
			
		}

} 
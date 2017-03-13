package utility;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import model.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;

public class YahooClient {
	
	String[] columns = {"Name", "Ticker", "Current Selling $",
			"Net Gain Today", "Additional Information"};
	public String[][] searchStock(String searchStr) throws IOException
	{
		yahoofinance.Stock stock = null;
		try {
			stock = YahooFinance.get(searchStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stock.print();
		
		
		java.util.Calendar from = java.util.Calendar.getInstance();
		java.util.Calendar to = java.util.Calendar.getInstance();
		from.add(java.util.Calendar.DAY_OF_MONTH, -20); //this gets the last 20 days but we only need the last recorded day
														//I ran into the issue of the stock market not running on weekends:).
														//they might close on holidays too, so the 20 days *should* cover it.
		 
		
		yahoofinance.Stock stockNet = YahooFinance.get("GOOG");
		
		List<HistoricalQuote> hist =  stockNet.getHistory(from, to, Interval.DAILY);
		HistoricalQuote recent = hist.get(0);
		double yesterdaysPrice = recent.getClose().doubleValue();
		double todaysPrice = YahooFinance.get(searchStr).getQuote(true).getPrice().doubleValue();
		double netGain = todaysPrice - yesterdaysPrice;
		
		//TODO: need to add meaningful website.
		String[][] data = {{stock.getName(), stock.getSymbol(), stock.getQuote(true).getPrice().toString(), String.valueOf(netGain), "www.website.com"}};
		
		return data;
	}
}

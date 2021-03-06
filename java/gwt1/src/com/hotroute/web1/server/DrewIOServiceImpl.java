package com.hotroute.web1.server;

import java.util.HashMap;
import java.util.Random;

import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.hotroute.web1.client.DrewIOService;
import com.hotroute.web1.shared.FieldVerifier;
import com.hotroute.web1.shared.StockPrice;
import com.hotroute.web1.shared.WeatherReport;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class DrewIOServiceImpl extends RemoteServiceServlet implements 	DrewIOService 
{
	HashMap<String,String> m_pictures = new HashMap<String,String>();
	String [] pixn = {"Authoring",
			"RunTest",
	"Context pad"};
	String [] pixu = {"http://home.comcast.net/~drewqb/portfolioweb/auth1.png",
			"http://home.comcast.net/~drewqb/portfolioweb/rt1.png",
	"http://home.comcast.net/~drewqb/portfolioweb/cp1.png"};

	private static final double MAX_TEMP = 99.0; 
	private static final double MAX_PRICE = 100.0; // $100.00
	private static final double MAX_PRICE_CHANGE = 0.02; // +/- 2%
	public StockPrice[] getPrices(String[] symbols) {
		Random rnd = new Random();

		StockPrice[] prices = new StockPrice[symbols.length];
		for (int i=0; i<symbols.length; i++) {
			double price = rnd.nextDouble() * MAX_PRICE;
			double change = price * MAX_PRICE_CHANGE * (rnd.nextDouble() * 2f - 1f);

			prices[i] = new StockPrice(symbols[i], price, change);
		}

		return prices;
	}
	public String greetServer(String input) throws IllegalArgumentException {
		// Verify that the input is valid. 
		if (!FieldVerifier.isValidName(input)) {
			// If the input is not valid, throw an IllegalArgumentException back to
			// the client.
			throw new IllegalArgumentException(
					"Name must be at least 4 characters long");
		}

		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");

		// Escape data from the client to avoid cross-site script vulnerabilities.
		input = escapeHtml(input);
		userAgent = escapeHtml(userAgent);

		return "Hello, " + input + "!<br><br>I am running " + serverInfo
				+ ".<br><br>It looks like you are using:<br>" + userAgent;
	}

	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}
	void buildMap()
	{
		if(!m_pictures.isEmpty()) return;

		for(int i=0;i<pixn.length;i++)	
		{
			m_pictures.put(pixn[i], pixu[i]);
		}
	}
	@Override
	public String getPictureUrl(String key) {
		buildMap();

		return m_pictures.get(key);
	}
	@Override
	public WeatherReport getWeather(String zip) {
		Random rnd = new Random();
		String [] desc = {"clear and sunny", "possible showers", "partly cloudy"};

		double temp = rnd.nextDouble() * MAX_TEMP;
		int idx = rnd.nextInt(desc.length-1);

		WeatherReport rep = new WeatherReport(zip, temp, desc[idx]);

		return rep;
	}
	@Override
	public String getJsonPrices(String[] symbols) {
		Random rnd = new Random();
		
		StringBuffer b = new StringBuffer();
		// {"balance": 1000.21, "num":100, "is_vip":true, "name":"foo"}
		b.append('{');
		b.append("\"values\":");
		b.append('[');
		for(String sym : symbols)
		{
			double price = rnd.nextDouble() * MAX_PRICE;
			double change = price * MAX_PRICE_CHANGE * (rnd.nextDouble() * 2f - 1f);
			b.append('{');
			
			b.append("\"symbol\":");
			b.append('"');
			b.append(sym);
			b.append('"');
			b.append(',');
			
			b.append("\"price\":");
			b.append(price);
			b.append(',');
			
			b.append("\"change\":");
			b.append(change);
			
			b.append('}');
			b.append(',');
		}
		b.append(']');
		b.append('}');
		return b.toString();
	}
	
}

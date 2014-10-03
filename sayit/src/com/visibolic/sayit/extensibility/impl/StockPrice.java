package com.visibolic.sayit.extensibility.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import android.util.Log;

public class StockPrice  {//implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6172114557033412260L;
	private static final double MAX_PRICE = 100.0; // $100.00
	private static final double MAX_PRICE_CHANGE = 0.02; // +/- 2%

	double m_price=0;
	String m_symbol;
	double m_change=0;

	public StockPrice()
	{

	}
	public StockPrice(String s, double p, double ch)
	{
		m_symbol=s;
		m_price=p;
		m_change=ch;
	}
	public String getPriceStr()
	{
		return String.format("%.2f", m_price);

	}
	public String getChangeStr()
	{
		return String.format("%.2f", m_change);

	}
	public double getPrice()
	{
		return m_price;
	}
	public String getSymbol()
	{
		return m_symbol;
	}
	public double getChange()
	{
		return m_change;
	}
	// ie. http://finance.google.com/finance/info?client=ig&q=NASDAQ:GOOG,NASDAQ:YHOO
	static public String getJsonGooglePricesQuery(String[] symbols) 
	{
		String base = "http://finance.google.com/finance/info?client=ig&q=";
		StringBuffer url = new StringBuffer();
		url.append(base);
		for(int i=0;i<symbols.length;i++)
		{
			String s = symbols[i];
			url.append(s);
			if(i<symbols.length-1)
			{
				url.append(',');
			}
		}
		return url.toString();

	}
	public static String readJsonGooglePrices(String[] symbols) 
	{
		String sInput = getJsonGooglePricesQuery(symbols);

		StringBuilder builder = new StringBuilder();
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(sInput);
		try 
		{
			HttpResponse response = client.execute(httpGet);
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			if (statusCode == 200) {
				HttpEntity entity = response.getEntity();
				InputStream content = entity.getContent();
				BufferedReader reader = new BufferedReader(new InputStreamReader(content));
				String line;
				while ((line = reader.readLine()) != null) 
				{
					builder.append(line);
				}
			} 
			else 
			{
				Log.e("StockTable", "Failed to download file");
			}
		} 
		catch (Exception e) {
		}
		return builder.toString();
	}
	public static List<StockPrice> getGoogleStockJson(String sJson)
	{
		List<StockPrice> lp = new ArrayList<StockPrice>();
		try {
			String token[] = sJson.split("//"); 

			JSONArray stocks = new JSONArray(token[1]);

			for(int i=0;i<stocks.length();i++)
			{
				JSONObject jsonObject = (JSONObject)stocks.get(i);

				String t = jsonObject.getString("t");
				String l_cur = jsonObject.getString("l_cur");
				String cp = jsonObject.getString("cp");
				/*
				String id = jsonObject.getString("id");
				String e = jsonObject.getString("e");
				String l = jsonObject.getString("l");
				String ltt = jsonObject.getString("ltt");
				String lt = jsonObject.getString("lt");
				String c = jsonObject.getString("c");
				String s = jsonObject.getString("s");
				
				String ccol = jsonObject.getString("ccol");
				*/
				
				StockPrice p1 = new StockPrice(t, Double.valueOf(l_cur), Double.valueOf(cp));
				lp.add(p1);
			}			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lp;

	}
	static public String getJsonPrices(String[] symbols) {
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
	public static List<StockPrice> getStockJson(String s)
	{
		List<StockPrice> lp = new ArrayList<StockPrice>();
		try {
			JSONObject root = new JSONObject(s);
			if(root != null)
			{
				JSONArray stocks = (JSONArray)root.get("values");
				for(int i=0;i<stocks.length();i++)
				{
					JSONObject jsp = (JSONObject)stocks.get(i);
					String sym  =  jsp.getString("symbol");
					double pr = jsp.getDouble("price");
					double ch = jsp.getDouble("change");
					StockPrice p1 = new StockPrice(sym, pr, ch);
					lp.add(p1);
				}
			}			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lp;

	}
}

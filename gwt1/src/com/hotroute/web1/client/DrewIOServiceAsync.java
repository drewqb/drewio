package com.hotroute.web1.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.hotroute.web1.shared.StockPrice;
import com.hotroute.web1.shared.WeatherReport;


public interface DrewIOServiceAsync {
	
	void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback);
	void getPictureUrl(String key, AsyncCallback<String> callback);
	void getWeather(String zip, AsyncCallback<WeatherReport> callback);
}

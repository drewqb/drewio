package com.hotroute.web1.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.hotroute.web1.shared.StockPrice;


public interface DrewIOServiceAsync {
	
	void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback);
	void getPictureUrl(String key, AsyncCallback<String> callback);
}

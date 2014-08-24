package com.hotroute.web1.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.hotroute.web1.shared.StockPrice;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("drewio")
public interface DrewIOService extends RemoteService {
	StockPrice[] getPrices(String[] symbols);
	String getPictureUrl(String key);
}

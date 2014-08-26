package com.hotroute.web1.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.ListDataProvider;
import com.hotroute.web1.shared.StockPrice;

public class StockPanel extends VerticalPanel{

	public StockPanel()
	{
		HorizontalPanel h1 = new HorizontalPanel();
		h1.setSize("100px", "100px");

		HorizontalPanel h2 = new HorizontalPanel();
		h2.setSize("100px", "100px");

		h2.setSpacing(10);  

		this.setSize("100px", "100px");
		final Button sendButton = new Button("Call Service");
		sendButton.addStyleName("sendButton");


		final ListBox lbResults = new ListBox();
		lbResults.setVisibleItemCount(15);
		lbResults.setWidth("100px");

		final CellTable<StockPrice> table = new CellTable<StockPrice>();
		TextColumn<StockPrice> symbol = new TextColumn<StockPrice>() {
			@Override
			public String getValue(StockPrice s) {
				return s.getSymbol();
			}
		};
		TextColumn<StockPrice> price = new TextColumn<StockPrice>() {
			@Override
			public String getValue(StockPrice s) {
				return String.valueOf(s.getPrice());
			}
		};
		TextColumn<StockPrice> ch = new TextColumn<StockPrice>() {
			@Override
			public String getValue(StockPrice s) {
				return String.valueOf(s.getChange());
			}
		};
		table.addColumn(symbol, "Symbol");
		table.addColumn(price, "Price");
		table.addColumn(ch, "Change");

		final ListDataProvider<StockPrice> dataProvider = new ListDataProvider<StockPrice>();
		// Connect the table to the data provider.
		dataProvider.addDataDisplay(table);



		this.add(sendButton);
		this.add(h1);
		this.add(h2);



		h1.add(lbResults);
		h1.add(table);

		sendButton.addClickHandler( new ClickHandler() 
		{
			public void onClick(ClickEvent event) {
				sendButton.setEnabled(false);

				fillPrices(lbResults, dataProvider);
				addJsonPrice(dataProvider);

				sendButton.setEnabled(true);

			}
		});
	}

	void addJsonPrice(final ListDataProvider<StockPrice> dataProvider)
	{
		String[] symbols ={"ratl" ,"ibm", "aleri", "sap"}; 
		ServiceAPI.getInstance().getService().getJsonPrices(symbols,
				new AsyncCallback<String>() 
				{
			public void onFailure(Throwable caught) {

			}
			public void onSuccess(String result) 
			{

				dataProvider.getList().addAll(getStockJson(result));
				dataProvider.flush();

			}
				});

	}
	void fillPrices(final ListBox lb,  final ListDataProvider<StockPrice> dataProvider)
	{
		String[] symbols ={"aa" ,"bb", "cc", "dd"}; 
		ServiceAPI.getInstance().getService().getPrices(symbols,
				new AsyncCallback<StockPrice[]>() 
				{
					public void onFailure(Throwable caught) {
						lb.clear();
						lb.addItem("Failure - " + caught.getMessage());

					}
					public void onSuccess(StockPrice[] result) 
					{
						lb.clear();
						dataProvider.getList().clear();
						for(StockPrice sp: result)
						{
							StringBuffer b = new StringBuffer();
							b.append(sp.getSymbol());
							b.append('-');
							b.append(sp.getPrice());
							b.append('-');
							b.append(sp.getChange());
							lb.addItem(b.toString());
							dataProvider.getList().add(sp);


						}
						dataProvider.flush();

					}
				});
	}
	List<StockPrice> getStockJson(String s)
	{
		List<StockPrice> lp = new ArrayList<StockPrice>();

		Object sp = JSONParser.parse(s);
		if(sp instanceof JSONObject)
		{
			JSONObject root = (JSONObject)sp;
			
			JSONArray stocks = (JSONArray)root.get("values");
			for(int i=0;i<stocks.size();i++)
			{
				JSONObject jsp = (JSONObject)stocks.get(i);
				JSONString sym  = (JSONString)jsp.get("symbol");
				JSONNumber pr = (JSONNumber)jsp.get("price");
				JSONNumber ch = (JSONNumber)jsp.get("change");
				StockPrice p1 = new StockPrice(sym.stringValue(), pr.doubleValue(), ch.doubleValue());
				lp.add(p1);
			}
		}
		return lp;

	}
}

package com.hotroute.web1.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.StackPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Gwt1 implements EntryPoint {

	PushButton showStocks;
	PushButton showOther;
	
	MainPanel mainPanel = new MainPanel();
	StockPanel stockPanel = new StockPanel();
	
	HorizontalPanel nowShowingPanel = new HorizontalPanel();
	StackPanel stackPanel = new StackPanel();

	public void onModuleLoad()
	{

		showStocks = new PushButton("Stock Panel");
		showOther = new PushButton("Image Panel");
		stackPanel.setWidth("250px");
		
		VerticalPanel drawer1 = new VerticalPanel();

		drawer1.add(showStocks);
		drawer1.add(showOther);
		
		
		stackPanel.add(drawer1, "Examples");


		
		
		nowShowingPanel.add(stackPanel);

		nowShowingPanel.add(mainPanel);
		//stockPanel.create(nowShowingPanel);
		hookShowOther();
		hookShowStock();
		
		RootPanel.get().add(nowShowingPanel);
	}
	void hookShowOther()
	{
		showOther.addClickHandler( new ClickHandler() 
		{
			public void onClick(ClickEvent event) {
				showOther.setEnabled(false);

				nowShowingPanel.remove(1);
				nowShowingPanel.add(mainPanel);

				showOther.setEnabled(true);

			}
		});
		
	}
	void hookShowStock()
	{
		showStocks.addClickHandler( new ClickHandler() 
		{
			public void onClick(ClickEvent event) {
				showStocks.setEnabled(false);

				nowShowingPanel.remove(1);
				nowShowingPanel.add(stockPanel);

				showStocks.setEnabled(true);

			}
		});
	}
}

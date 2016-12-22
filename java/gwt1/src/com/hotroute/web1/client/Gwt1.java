package com.hotroute.web1.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.StackPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Gwt1 implements EntryPoint {

	PushButton showStocks;
	PushButton showOther;
	PushButton showBinder;
	
	MainPanel mainPanel = new MainPanel();
	StockPanel stockPanel = new StockPanel();
	
	HorizontalPanel nowShowingPanel = new HorizontalPanel();
	StackPanel stackPanel = new StackPanel();

	BinderSample binderPanel = new BinderSample();
	
	public void onModuleLoad()
	{

		showStocks = new PushButton("Stock Panel");
		showOther = new PushButton("Image Panel");
		showBinder = new PushButton("Binder Panel");
		
		stackPanel.setWidth("250px");
		
		VerticalPanel drawer1 = new VerticalPanel();
		VerticalPanel drawer2 = new VerticalPanel();
		
		drawer1.add(showOther);
		drawer1.add(showStocks);
		drawer1.add(showBinder);
		
		stackPanel.add(drawer1, "Examples");
		stackPanel.add(drawer2, "TBD");

		PushButton tbd1 = new PushButton("TBD1");
		tbd1.addClickHandler( new ClickHandler() 
		{
			public void onClick(ClickEvent event) {
				Window.alert("Tbd1");
			}
		});
		drawer2.add(tbd1);
		
		nowShowingPanel.add(stackPanel);
		nowShowingPanel.add(mainPanel);
		
		
		hookShowOther();
		hookShowStock();
		hookBinder();
		
		RootPanel.get().add(nowShowingPanel);
	}
	void hookBinder()
	{
		showBinder.addClickHandler( new ClickHandler() 
		{
			public void onClick(ClickEvent event) {
				showBinder.setEnabled(false);

				nowShowingPanel.remove(1);
				nowShowingPanel.add(binderPanel);

				showBinder.setEnabled(true);

			}
		});
		
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

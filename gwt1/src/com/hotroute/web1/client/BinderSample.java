package com.hotroute.web1.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.hotroute.web1.shared.WeatherReport;

public class BinderSample extends Composite {

	@UiField Button weatherButton;
	@UiField TextBox zipcode;
	@UiField Label weatherResult;
		
	private static BinderSampleUiBinder uiBinder = GWT
			.create(BinderSampleUiBinder.class);

	interface BinderSampleUiBinder extends UiBinder<Widget, BinderSample> {
	}

	public BinderSample() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	@UiHandler("weatherButton")
	void handleClick(ClickEvent e) 
	{
	    setWeather(this.zipcode.getText());
	}
	void setWeather( String theKey)
	{
		ServiceAPI.getInstance().getService().getWeather(theKey, 
				new AsyncCallback<WeatherReport>() {
			public void onFailure(Throwable caught) {

			}
			public void onSuccess(WeatherReport result) 
			{
				StringBuffer b = new StringBuffer();
				b.append("Weather at ");
				b.append(result.getLocation());
				b.append(' ');
				b.append(result.getTemp());
				b.append(' ');
				b.append(result.getDescription());
				b.append(' ');
					
				weatherResult.setText(b.toString());
			}
		});
	}
}

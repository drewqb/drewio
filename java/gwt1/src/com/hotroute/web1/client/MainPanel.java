package com.hotroute.web1.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainPanel extends VerticalPanel{

	public MainPanel()
	{
		HorizontalPanel h1 = new HorizontalPanel();
		h1.setSize("100px", "100px");
		h1.setSpacing(10);  

		this.setSize("100px", "100px");
		

		final Image theImage = new Image();
		theImage.setWidth("800px");


		String [] pixn = {"Authoring",
				"RunTest",
		"Context pad"};

		setImage(theImage, pixn[0]);

		for(int i=0;i<pixn.length;i++)	
		{
			RadioButton radioButton = new RadioButton("myGroup", pixn[i]);
			h1.add(radioButton);
			if(i==0) radioButton.setValue(true);

			radioButton.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) 
				{
					RadioButton r = (RadioButton) event.getSource();
					String src = r.getText();
					setImage(theImage, src);


				}
			});
		}



		this.add(h1);
		h1.add(theImage);



	}
	
		void setImage(final Image theImage, String theKey)
		{
			ServiceAPI.getInstance().getService().getPictureUrl(theKey, 
					new AsyncCallback<String>() {
				public void onFailure(Throwable caught) {

				}
				public void onSuccess(String result) {
					theImage.setUrl(result);
				}
			});
		}

	}

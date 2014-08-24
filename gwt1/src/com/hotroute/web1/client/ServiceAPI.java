package com.hotroute.web1.client;

import com.google.gwt.core.client.GWT;

public class ServiceAPI {
	private static ServiceAPI m_Instance;

	private final DrewIOServiceAsync m_drewioService = GWT.create(DrewIOService.class);

	private ServiceAPI()
	{
	}
	public DrewIOServiceAsync getService()
	{
		return m_drewioService;
	}
	public static ServiceAPI getInstance()
	{
		if(m_Instance==null)
		{
			m_Instance=new ServiceAPI();
		}
		return m_Instance;
	}
}

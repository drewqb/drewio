package com.visibolic.sayit.fragments;

import android.app.Fragment;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.visibolic.sayit.R;

public class ProximityFragment extends Fragment implements LocationListener
{
	private TextView mCurrentLocationField;
	private TextView mHomeField;
	private TextView mDistanceField;
	private EditText mLatitude;
	private EditText mLongitude;
	private Button mSetLocation;
	private Button mCurrentLocation;
	
	private static final double mHomeLat = 39.9826280;
	private static final double mHomeLong = -74.9164930;
	private LocationManager mLocManager;
	private String mStrProvider	= "Sayit Proximity Provider";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{
		View rootView = inflater.inflate(R.layout.proximity, container, false);
		mCurrentLocationField = (TextView) rootView.findViewById(R.id.CurrentLocationValue);
		mHomeField = (TextView) rootView.findViewById(R.id.HomeLocationValue);
		mDistanceField = (TextView) rootView.findViewById(R.id.DistanceValue);
		mLocManager = (LocationManager) rootView.getContext().getSystemService(Context.LOCATION_SERVICE);
		mLatitude = (EditText) rootView.findViewById(R.id.LatitudeValue);
		mLongitude = (EditText) rootView.findViewById(R.id.LongitudeValue);
		mSetLocation = (Button) rootView.findViewById(R.id.SetLocationButton);
		mCurrentLocation = (Button) rootView.findViewById(R.id.SetCurrentButton);
		
		// use default criteria
		Criteria criteria = new Criteria();
		mStrProvider = mLocManager.getBestProvider(criteria, false);
		
		mSetLocation.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				try
				{
					double dLat = Double.valueOf(mLatitude.getEditableText().toString());
					Double dLong = Double.valueOf(mLongitude.getEditableText().toString());
					setHomeLocation(dLat, dLong);
				}
				catch(Exception e)
				{
					
				}
			}
			
		});
		mCurrentLocation.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				useCurrentLocationAsHome();
			}
			
		});
		setHomeLocation(mHomeLat, mHomeLong);
		
		return rootView;
	}
	void useCurrentLocationAsHome()
	{
		Location location = mLocManager.getLastKnownLocation(mStrProvider);
		if (location != null) 
		{
			setHomeLocation(location.getLatitude(), location.getLongitude());
		}
	}
	void updateCurrentPosition()
	{
		Location location = mLocManager.getLastKnownLocation(mStrProvider);
		// Initialize the location fields
		if (location != null) 
		{
			onLocationChanged(location);
		} 
		else 
		{
			mCurrentLocationField.setText("Location not set");
		}
		
	}
	void setHomeLocation(double dLat, double dLong)
	{
		mLatitude.setText(String.valueOf(dLat));
		mLongitude.setText(String.valueOf(dLong));
		
		mHomeField.setText(getLocationValue(dLat, dLong));
		
		updateCurrentPosition();

	}
	private String getLocationValue(double lat, double longi)
	{
		StringBuffer b = new StringBuffer();
		
		b.append(lat);
		b.append(',');
		b.append(longi);
		
		return b.toString();
	}
	@Override
	public void onResume() {
		super.onResume();
		mLocManager.requestLocationUpdates(mStrProvider, 400, 1, this);
	}

	@Override
	public void onPause() {
		super.onPause();
		mLocManager.removeUpdates(this);
	}
	double getDouble(EditText e)
	{
		try 
		{
			return Double.valueOf(e.getText().toString());	
		} 
		catch (Exception e2) {
		}
		return 0;
	}
	@Override
	public void onLocationChanged(Location location) {
		double lat =  location.getLatitude();
		double lng =  location.getLongitude();
		mCurrentLocationField.setText(String.valueOf(getLocationValue(lat,lng)));
		
		Location homeLoc = new Location("Home Location");  
		homeLoc.setLatitude(getDouble(this.mLatitude));
		homeLoc.setLongitude(getDouble(this.mLongitude));
		
		double dist1Km = Math.round(location.distanceTo(homeLoc)*.001);
		double distMi = Math.round(0.621371 * dist1Km);
		
		StringBuffer b = new StringBuffer();
		b.append(distMi);
		b.append(" (Miles) ");
		b.append(dist1Km);
		b.append(" (Km) ");
		
		mDistanceField.setText(b.toString());
		
	}
	 
	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
	}
	@Override
	public void onProviderEnabled(String provider) {

	}

	@Override
	public void onProviderDisabled(String provider) {
	}
	
}

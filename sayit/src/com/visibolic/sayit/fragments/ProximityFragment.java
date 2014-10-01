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
import android.widget.TextView;
import android.widget.Toast;

import com.visibolic.sayit.R;

public class ProximityFragment extends Fragment implements LocationListener
{
	private TextView mCurrentLocationField;
	private TextView mHomeField;
	private TextView mDistanceField;
	double mHomeLat = 39.9826280;
	double mHomeLong = -74.9164930;
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

		// use default criteria
		Criteria criteria = new Criteria();
		mStrProvider = mLocManager.getBestProvider(criteria, false);
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
		mHomeField.setText(getLocationValue(mHomeLat, mHomeLong));
		
		return rootView;
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

	@Override
	public void onLocationChanged(Location location) {
		double lat =  location.getLatitude();
		double lng =  location.getLongitude();
		mCurrentLocationField.setText(String.valueOf(getLocationValue(lat,lng)));
		Location homeLoc = new Location("Home Location");  
		homeLoc.setLatitude(mHomeLat);
		homeLoc.setLongitude(mHomeLong);
		
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

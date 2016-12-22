package com.visibolic.sayit.fragments;

import com.visibolic.sayit.views.RandomPictureView;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PictureViewFragment extends Fragment
{
	RandomPictureView rootView;
	Context myContext;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		myContext= container.getContext();
		
		//View rootView = inflater.inflate(R.layout.fragmenttab3, container, false);
		if(rootView==null)
		{
			rootView = new RandomPictureView(myContext);
		}
		//TextView rootView = new TextView(container.getContext());
    	//rootView.setText("This is Tab1");
		rootView.invalidate();
		return rootView;
	}

	@Override
	public void onPause() {
		//rootView.surfaceDestroyed(rootView.getHolder());
		super.onPause();
	}

	@Override
	public void onResume() {
		//rootView = new RandomPictureView(myContext);
		rootView.invalidate();
		super.onResume();
	}
	}

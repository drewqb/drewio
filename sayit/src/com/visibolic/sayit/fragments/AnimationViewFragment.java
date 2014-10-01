package com.visibolic.sayit.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.visibolic.sayit.views.AnimationView;
import com.visibolic.sayit.views.RandomPictureView;

public class AnimationViewFragment extends Fragment
{
	AnimationView rootView;
	Context myContext;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		myContext= container.getContext();
		
		//View rootView = inflater.inflate(R.layout.fragmenttab3, container, false);
		if(rootView==null)
		{
			rootView = new AnimationView(myContext);
		}
		//TextView rootView = new TextView(container.getContext());
    	//rootView.setText("This is Tab1");
		rootView.invalidate();
		return rootView;
	}

	@Override
	public void onPause() {
		rootView.setRunning(false);
		
		super.onPause();
	}

	@Override
	public void onResume() {
		rootView.setRunning(true);
		rootView.invalidate();
		super.onResume();
	}
	}

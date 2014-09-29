package com.visibolic.sayit.fragments;

import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.visibolic.sayit.R;
import com.visibolic.sayit.extensibility.IMouth;
import com.visibolic.sayit.extensibility.impl.Mouth;
import com.visibolic.sayit.extensibility.impl.MouthPNG;

public class SayitFragment extends Fragment
{
	ImageView myImageView;
	Button myButtonSay;

	EditText myTextInput;	
	IMouth myMouth = null;	
	Spinner mySpinner;
	Context myContext;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,	Bundle savedInstanceState) 
	{
		View rootView = inflater.inflate(R.layout.sayit, container, false);
		myContext = container.getContext();
		createUI(rootView);
		return rootView;
	}
	void createUI(View container)
	{

		myImageView = (ImageView) container.findViewById(R.id.ImageView01);
		myButtonSay = (Button) container.findViewById(R.id.Button01);
		myTextInput = (EditText) container.findViewById(R.id.EditText01);
		myButtonSay.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				handleOnClickSay();
			}
			
		});
		
		
		
		myTextInput.setText("Type something and press say");

		myMouth = new Mouth(getResources());
		
		myImageView.setImageResource(myMouth.getResting());
		mySpinner = (Spinner)container.findViewById(R.id.Spinner01);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				container.getContext(), R.array.mouthtypes, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mySpinner.setAdapter(adapter);
		mySpinner.setOnItemSelectedListener(
				new OnItemSelectedListener() {
					public void onItemSelected(AdapterView<?> parent, View view, int position, long id) 
					{
						myMouth = id==0 ? new MouthPNG(getResources()) :  new Mouth(getResources());

						myImageView.setImageResource(myMouth.getResting());
					}
					public void onNothingSelected(AdapterView<?> parent) 
					{
					}
				});

	}
	void showToast(CharSequence msg) {
		Toast.makeText(myContext, msg, Toast.LENGTH_SHORT).show();
	}

	void handleOnClickSay()
	{
		Editable e = myTextInput.getEditableText();
		AnimationDrawable a = myMouth.parseAnimation(e);
		myImageView.setImageDrawable(a);
		a.start();
		speak(e);
	}
	
	private void speak(Editable e)
	{

		String hello = e.toString();
		if(hello.length()<1)
		{
			hello="hello";
		}
		showToast(hello);
		
	}
}

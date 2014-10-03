package com.visibolic.sayit.fragments;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.visibolic.sayit.R;

public class StringListFragment extends Fragment 
{
	String[] values =  { "Eagles", "Profs", "Quakers",
			"Chiefs", "Pride", "Crimson Tide" };
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.list_test, container, false);

		ListView listview = (ListView)rootView.findViewById(R.id.listview1);

		populateList(listview);

		listview.setOnItemClickListener(new OnItemClickListener() 
		{

			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				String msg = (String) parent.getItemAtPosition(position);
				Toast.makeText(parent.getContext(), msg, Toast.LENGTH_SHORT).show();
			}

		});
		return rootView;
	}
	void populateList(ListView listview)
	{
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < values.length; ++i) 
		{
			list.add(values[i]);
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String> (listview.getContext(), android.R.layout.simple_list_item_1, list);
		listview.setAdapter(adapter);
	}
	
}

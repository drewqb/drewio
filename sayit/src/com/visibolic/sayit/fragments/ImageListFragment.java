package com.visibolic.sayit.fragments;

import java.util.ArrayList;
import java.util.List;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.visibolic.sayit.R;

public class ImageListFragment extends Fragment 
{
	String[] values =  { "Eagles", "Profs", "Quakers",
			"Chiefs", "Pride", "Crimson Tide" };
	int images[] = {
			R.drawable.eagles,		
			R.drawable.profs,
			R.drawable.quakers,
			R.drawable.chiefs,
			R.drawable.widener,
			R.drawable.crimson_tide};

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
				ListItem li = (ListItem)parent.getItemAtPosition(position);
				String msg=li.getText();
				Toast.makeText(parent.getContext(), msg, Toast.LENGTH_SHORT).show();
			}

		});
		return rootView;
	}
	void populateList(ListView listview)
	{
		
		ArrayList<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < values.length; ++i) 
		{
			ListItem li = new ListItem( images[i], values[i]);

			list.add(li);
		}
		CustomAdapter adapter = new CustomAdapter (listview.getContext(),list);
		listview.setAdapter(adapter);
	}
	class ListItem
	{
		private int myImage;
		private String myText;

		public ListItem(int image, String txt)
		{
			myImage=image;
			myText=txt;
		}
		public int getImage()
		{
			return myImage;

		}
		public String getText()
		{
			return myText;
		}
	}
	class CustomAdapter extends BaseAdapter
	{
		private List<ListItem> myData;
		private LayoutInflater l_Inflater;

		public CustomAdapter(Context context, List<ListItem> results)
		{
			myData = results;
			l_Inflater = LayoutInflater.from(context);

		}
		@Override
		public int getCount() {
			return myData.size();

		}

		@Override
		public Object getItem(int position) {
			return myData.get(position);

		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) 
		{
			
			ViewHolder holder;
			if (convertView == null) {
				convertView = l_Inflater.inflate(R.layout.list_row, null);
				holder = new ViewHolder();
				holder.txtText = (TextView) convertView.findViewById(R.id.title);
				holder.imageThumb = (ImageView) convertView.findViewById(R.id.thumbnail);
				convertView.setTag(holder);
			} 
			else 
			{
				holder = (ViewHolder) convertView.getTag();
			}
			holder.txtText.setText(myData.get(position).getText());
			holder.imageThumb.setImageResource(myData.get(position).getImage());
			return convertView;

		}

	}
	static class ViewHolder {
		TextView txtText;
		ImageView imageThumb;
	}

}

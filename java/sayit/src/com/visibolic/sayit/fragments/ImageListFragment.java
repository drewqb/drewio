package com.visibolic.sayit.fragments;

import java.util.ArrayList;
import java.util.List;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
	String[] urls =  { "http://www.philadelphiaeagles.com/", "http://www.rowanathletics.com/index.aspx?path=football", "http://mhs-athletics-homepage.mhs.mtps.schoolfusion.us/modules/groups/group_pages.phtml?gid=2354662&nid=232430&sessionid=1247b002e5c852c72658a64d9a5500e5&sessionid=1247b002e5c852c72658a64d9a5500e5",
			"http://www.google.com", "http://www.widener.edu", "https://mybama.ua.edu/cp/home/displaylogin" };
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
				launchBrowser(li);
			}

		});
		return rootView;
	}
	void launchBrowser(ListItem li)
	{
		Uri uri = Uri.parse(li.getUrl());
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
        //Intent i = new Intent(this.getActivity(), WebviewActivity.class);
        //i.putExtra("url", li.getUrl());
        //startActivity(i);
		
	    
	}
	void populateList(ListView listview)
	{
		
		ArrayList<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < values.length; ++i) 
		{
			ListItem li = new ListItem( images[i], values[i], urls[i]);

			list.add(li);
		}
		CustomAdapter adapter = new CustomAdapter (listview.getContext(),list);
		listview.setAdapter(adapter);
	}
	class ListItem
	{
		private int myImage;
		private String myText;
		private String myUrl;
		public ListItem(int image, String txt, String url)
		{
			myImage=image;
			myText=txt;
			myUrl=url;
		}
		public int getImage()
		{
			return myImage;

		}
		public String getText()
		{
			return myText;
		}
		public String getUrl()
		{
			return myUrl;
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
				holder.txtUrl = (TextView) convertView.findViewById(R.id.url_choice);
				holder.imageThumb = (ImageView) convertView.findViewById(R.id.thumbnail);
				convertView.setTag(holder);
			} 
			else 
			{
				holder = (ViewHolder) convertView.getTag();
			}
			holder.txtText.setText(myData.get(position).getText());
			holder.txtUrl.setText(myData.get(position).getUrl());
			holder.imageThumb.setImageResource(myData.get(position).getImage());
			return convertView;

		}

	}
	static class ViewHolder {
		TextView txtText;
		TextView txtUrl;
		ImageView imageThumb;
	}

}

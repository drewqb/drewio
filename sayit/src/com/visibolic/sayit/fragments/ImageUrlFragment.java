package com.visibolic.sayit.fragments;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import android.app.Fragment;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.visibolic.sayit.R;

public class ImageUrlFragment extends Fragment 
{
	private GridView mGridView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{
		mGridView = (GridView)inflater.inflate(R.layout.portfolio, container, false);
		mGridView.setOnItemClickListener(new OnItemClickListener() 
		{
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				GridItem li = (GridItem)parent.getItemAtPosition(position);
				launchBrowser(li);
			}
		});
		String [] pixu = 
				{"http://home.comcast.net/~drewqb/portfolioweb/auth1.png",
				"http://home.comcast.net/~drewqb/portfolioweb/rt1.png",
				"http://home.comcast.net/~drewqb/portfolioweb/cp1.png",
				"http://home.comcast.net/~drewqb/portfolioweb/dbg1.png",
				"http://home.comcast.net/~drewqb/portfolioweb/07rsa1.PNG",
				"http://home.comcast.net/~drewqb/portfolioweb/05xde_canvas.PNG"};
		PopulateListTask task = new PopulateListTask();
		task.execute(pixu);
		return mGridView;
	}
	private void setTaskResult(CustomAdapter result)
	{
		if(result!=null && mGridView!=null)
		{
			mGridView.setAdapter(result);
		}
	}
	void launchBrowser(GridItem li)
	{
		

	}
	class GridItem
	{
		private Drawable myImage;
		private String myText;
		public GridItem(Drawable image, String txt)
		{
			myImage=image;
			myText=txt;
		}
		public Drawable getImage()
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
		private List<GridItem> myData;
		private LayoutInflater l_Inflater;

		public CustomAdapter(List<GridItem> results)
		{
			myData = results;
			l_Inflater = LayoutInflater.from(getActivity());

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
				convertView = l_Inflater.inflate(R.layout.portfolio_row, null);
				holder = new ViewHolder();
				holder.txtText = (TextView) convertView.findViewById(R.id.portfolio_name);
				holder.imageThumb = (ImageView) convertView.findViewById(R.id.portfolio_image);
				convertView.setTag(holder);
			} 
			else 
			{
				holder = (ViewHolder) convertView.getTag();
			}
			holder.txtText.setText(myData.get(position).getText());
			holder.imageThumb.setImageDrawable(myData.get(position).getImage());
			return convertView;

		}

	}
	static class ViewHolder {
		TextView txtText;
		ImageView imageThumb;
	}

	class PopulateListTask extends  AsyncTask<String, Void, CustomAdapter>
	{
		@Override
		public void onPreExecute() 
		{
			getActivity().setProgressBarIndeterminateVisibility(true);
		}
		@Override
		protected CustomAdapter doInBackground(String... urls) 
		{
			ArrayList<GridItem> list = new ArrayList<GridItem>();

			for(String theUrl : urls)
			{
			    try 
			    {
			        InputStream in = new java.net.URL(theUrl).openStream();
			        //Bitmap bmp = BitmapFactory.decodeStream(in);
			        //BitmapDrawable bd = new BitmapDrawable( bmp); 
			        Drawable bd = Drawable.createFromStream(in, null);
			        
			        GridItem g = new GridItem(bd, theUrl);
			        list.add(g);
			        
			        in.close();
			        
			    } catch (Exception e) {
			        Log.e("Error", e.getMessage());
			        e.printStackTrace();
			    }
				
			}
			
			CustomAdapter adapter = new CustomAdapter (list);
			
			return adapter;
		}
		@Override
		protected void onPostExecute(CustomAdapter result) 
		{
			getActivity().setProgressBarIndeterminateVisibility(false);
			setTaskResult(result);
		}


	}
}

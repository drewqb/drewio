package com.visibolic.sayit.fragments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.app.Fragment;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
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

public class LauncherFragment extends Fragment 
{
	private GridView mGridView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{
		mGridView = (GridView)inflater.inflate(R.layout.launcher, container, false);
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

		PopulateListTask task = new PopulateListTask();
		task.execute(new String[] { "Start" });
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
		Intent intent = new Intent(Intent.ACTION_MAIN);
		String pkgName = li.getDataInfo().activityInfo.applicationInfo.packageName;
		String activityName = li.getDataInfo().activityInfo.name;
		intent.setComponent(new ComponentName(pkgName,activityName));
		//Intent result = new Intent();
		//result.putExtra(Intent.EXTRA_SHORTCUT_INTENT, intent);
		//result.putExtra(Intent.EXTRA_SHORTCUT_NAME, info.loadLabel(mPackageManager));
		//setResult(RESULT_OK, result);
		startActivity(intent);

	}
	class GridItem
	{
		private Drawable myImage;
		private String myText;
		private ResolveInfo mAppInfo;
		public GridItem(Drawable image, String txt,  ResolveInfo app)
		{
			myImage=image;
			myText=txt;
			mAppInfo = app;
		}
		public ResolveInfo getDataInfo()
		{
			return mAppInfo;

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
				convertView = l_Inflater.inflate(R.layout.launcher_row, null);
				holder = new ViewHolder();
				holder.txtText = (TextView) convertView.findViewById(R.id.launcher_name);
				holder.imageThumb = (ImageView) convertView.findViewById(R.id.launcher_image);
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
		protected CustomAdapter doInBackground(String... params) 
		{
			PackageManager mPackageManager = getActivity().getPackageManager();
			Intent queryIntent = new Intent(Intent.ACTION_MAIN);
			queryIntent.addCategory(Intent.CATEGORY_LAUNCHER);
			List<ResolveInfo> reslist = mPackageManager.queryIntentActivities(queryIntent, 0);
			//to sort the list of apps by their names
			Collections.sort(reslist, new ResolveInfo.DisplayNameComparator(mPackageManager));

			ArrayList<GridItem> list = new ArrayList<GridItem>();
			for(ResolveInfo item : reslist) 
			{
				String nm = item.loadLabel(mPackageManager).toString();
				Drawable icon = item.loadIcon(mPackageManager);
				GridItem li = new GridItem( icon, nm,  item);
				list.add(li);
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

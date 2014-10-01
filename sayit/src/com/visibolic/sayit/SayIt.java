package com.visibolic.sayit;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.visibolic.sayit.activities.SettingsActivity;
import com.visibolic.sayit.fragments.AnimationViewFragment;
import com.visibolic.sayit.fragments.ImageListFragment;
import com.visibolic.sayit.fragments.PictureViewFragment;
import com.visibolic.sayit.fragments.ProximityFragment;
import com.visibolic.sayit.fragments.SayitFragment;
import com.visibolic.sayit.fragments.StringListFragment;

public class SayIt extends Activity
{
	
	Fragment fragments[] = {
			new SayitFragment(),
			new ImageListFragment(),
			new StringListFragment(),
			new PictureViewFragment(),
			new AnimationViewFragment(),
			new ProximityFragment(),
			}; 
	String fragmentTitles[] = {"Main", "Images", "Strings", "Picture", "Animation", "Proximity"};		
			
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragcont);


		ActionBar actionBar = getActionBar();

		// Hide Actionbar Icon
		actionBar.setDisplayShowHomeEnabled(false);

		// Hide Actionbar Title
		actionBar.setDisplayShowTitleEnabled(false);

		// Create Actionbar Tabs
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		for(int i=0;i<fragments.length;i++)
		{
			ActionBar.Tab theTab = actionBar.newTab().setText(fragmentTitles[i]);
			theTab.setTabListener(new TabListener(fragments[i]));
			actionBar.addTab(theTab);
				
		}
	}	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.sayit_main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) 
		{
		case R.id.settings:
			// Launch settings activity
			Intent i = new Intent(this, SettingsActivity.class);
			startActivity(i);
			break;
			// more code...
		}
		return true;
	} 
	public class TabListener implements ActionBar.TabListener {

		Fragment fragment;

		public TabListener(Fragment fragment) {
			// TODO Auto-generated constructor stub
			this.fragment = fragment;
		}

		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			ft.replace(R.id.fragment_container, fragment);
		}

		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			ft.remove(fragment);
		}

		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub

		}
	}

}
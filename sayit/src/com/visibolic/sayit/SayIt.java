package com.visibolic.sayit;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.visibolic.sayit.fragments.ImageListFragment;
import com.visibolic.sayit.fragments.PictureViewFragment;
import com.visibolic.sayit.fragments.SayitFragment;
import com.visibolic.sayit.fragments.StringListFragment;

public class SayIt extends Activity
{
	 ActionBar.Tab pvTab, imageListTab, sayitTab, stringListTab;
	    Fragment pvFragment = new PictureViewFragment();
	    Fragment imageListFragment = new ImageListFragment();
	    Fragment sayitFragment = new SayitFragment();
	    Fragment stringListFragment = new StringListFragment();
	    
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
	 
	        // Set Tab Icon and Titles
	        sayitTab = actionBar.newTab().setText("Sayit");
	        pvTab = actionBar.newTab().setText("PictureView");
	        imageListTab = actionBar.newTab().setText("Image List");
	        stringListTab = actionBar.newTab().setText("String List");
	        
	        // Set Tab Listeners
	        sayitTab.setTabListener(new TabListener(sayitFragment));
	        pvTab.setTabListener(new TabListener(pvFragment));
	        imageListTab.setTabListener(new TabListener(imageListFragment));
	        stringListTab.setTabListener(new TabListener(stringListFragment));
	        
	        // Add tabs to actionbar
	        actionBar.addTab(sayitTab);
	        actionBar.addTab(pvTab);
	        actionBar.addTab(imageListTab);
	        actionBar.addTab(stringListTab);
	        
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
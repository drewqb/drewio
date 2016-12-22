package com.visibolic.sayit.activities;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.visibolic.sayit.R;

public class SettingsActivity extends PreferenceActivity {
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    addPreferencesFromResource(R.xml.sayit_preferences);
	  }

}

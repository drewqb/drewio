package com.visibolic.sayit;

import java.util.Locale;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class SayIt extends Activity implements LocationListener , OnClickListener, TextToSpeech.OnInitListener{
	ImageView v;
	Button next;
	EditText editText;	
	IMouth myMouth = null;	
	Spinner mySpinner;
	 private static final String TAG = "SayItDemo";

	 private TextToSpeech myTextToSpeach;
	 LocationManager locationManager = null;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		//setContentView(new SayItView2(this));
        setContentView(R.layout.main);
        v = (ImageView) findViewById(R.id.ImageView01);
        next = (Button) findViewById(R.id.Button01);
        editText = (EditText) findViewById(R.id.EditText01);
        next.setOnClickListener(this);
    
        myMouth = new Mouth(getResources());
        //myMouth = new MouthPNG(getResources());
        myTextToSpeach = new TextToSpeech(this,
                this  // TextToSpeech.OnInitListener
                );
        
        v.setImageResource(myMouth.getResting());
        mySpinner = (Spinner)findViewById(R.id.Spinner01);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.mouthtypes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(adapter);
        mySpinner.setOnItemSelectedListener(
                new OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) 
                    {
                        myMouth = id==0 ? new MouthPNG(getResources()) :  new Mouth(getResources());
                        
                        v.setImageResource(myMouth.getResting());
                        //showToast("Spinner1: position=" + position + " id=" + id);
                    }

                    public void onNothingSelected(AdapterView<?> parent) 
                    {
                      //  showToast("Spinner1: unselected");
                    }
                });
        //locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        //locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, this);
            
    }
    void showToast(CharSequence msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    
        
    @Override
	public void onClick(View theView) 
	{
    	Editable e = editText.getEditableText();
    	AnimationDrawable a = myMouth.parseAnimation(e);
    	v.setImageDrawable(a);
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
        myTextToSpeach.speak(hello,
            TextToSpeech.QUEUE_FLUSH,  // Drop all pending entries in the playback queue.
            null);
    }
    @Override
    public void onDestroy() {
        // Don't forget to shutdown!
        if (myTextToSpeach != null) {
            myTextToSpeach.stop();
            myTextToSpeach.shutdown();
        }

        super.onDestroy();
    }

    // Implements TextToSpeech.OnInitListener.
    public void onInit(int status) {
        // status can be either TextToSpeech.SUCCESS or TextToSpeech.ERROR.
        if (status == TextToSpeech.SUCCESS) {
            // Set preferred language to US english.
            // Note that a language may not be available, and the result will indicate this.
            int result = myTextToSpeach.setLanguage(Locale.ENGLISH);
            // Try this someday for some interesting results.
            // int result mTts.setLanguage(Locale.FRANCE);
            if (result == TextToSpeech.LANG_MISSING_DATA ||
                result == TextToSpeech.LANG_NOT_SUPPORTED) {
               // Lanuage data is missing or the language is not supported.
                Log.e(TAG, "Language is not available.");
            } else {
                // Check the documentation for other possible result codes.
                // For example, the language may be available for the locale,
                // but not for the specified country and variant.

                // The TTS engine has been successfully initialized.
                // Allow the user to press the button for the app to speak again.
                next.setEnabled(true);
                // Greet the user.
                
            }
        } else {
            // Initialization failed.
            Log.e(TAG, "Could not initialize TextToSpeech.");
        }
    }



	@Override
	public void onLocationChanged(Location location) {
		double lat = location.getLatitude();
		double lng = location.getLongitude();
		editText.setText(location.toString());
	}



	@Override
	public void onProviderDisabled(String arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onProviderEnabled(String arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		// TODO Auto-generated method stub
		
	}

  
       
    
}
package com.visibolic.sayit.extensibility.impl;

import com.visibolic.sayit.R;
import com.visibolic.sayit.R.drawable;
import com.visibolic.sayit.extensibility.IMouth;

import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.text.Editable;

public class MouthPNG implements IMouth{
	int images[] = {
			R.drawable.png_mouth_rest,		
			R.drawable.png_mouth_ai,
			R.drawable.png_mouth_cdgknrsyz,
			R.drawable.png_mouth_e,
			R.drawable.png_mouth_i,
			R.drawable.png_mouth_fv,
			R.drawable.png_mouth_l,
			R.drawable.png_mouth_mbp,
			R.drawable.png_mouth_o,
			R.drawable.png_mouth_uw};
	Resources myResources =null; 
	public MouthPNG(Resources res)
	{
		myResources=res;
	}
	@Override
	public int getResting() {
		return images[0];
	}
	int getImage(char c)
    {
    	
    	switch(c)
    	{
    	 	case 'a':
    	 		return images[1];
    	 	case 'c':
    	 	case 'd':
    	 	case 'g':
    	 	case 'k':
    	 	case 'n':
    	 	case 'r':
    	 	case 's':
    	 	case 'y':
    	 	case 'z':
    	 		return images[2];
    	 	case 'e':
    	 		return images[3];
    	 	case 'i':
    	 		return images[4];
    	  	case 'f':
    	 	case 'v':
    	 		return images[5];
    	 	case 'l':
    	 	case 't':
    	 		return images[6];
    	 	case 'm':
    	 	case 'b':
    	 	case 'p':
    	 		return images[7];
    	 	case 'o':
    	 		return images[8];
    	 	case 'u':
    	 	case 'w':
    	 	case 'q':
    	 		return images[9];
    	}
    	return images[0];
    }
    public AnimationDrawable parseAnimation(Editable e)
    {
    	
    	int cnt = e.length();
    	AnimationDrawable a = new AnimationDrawable();
    	Resources res = myResources;
    	
    	for(int x=0;x<cnt;x++)
    	{
    		char c = e.charAt(x);
    		a.addFrame(res.getDrawable(getImage(c)), 100);
    	    
    	}
    	if(cnt==0)
    	{
    		a.addFrame(res.getDrawable(images[0]), 50);
    	}
    	a.setOneShot(true);
    	a.setVisible(true,true);
    	return a;
    }
}

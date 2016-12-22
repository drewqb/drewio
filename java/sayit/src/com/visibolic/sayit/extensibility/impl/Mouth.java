package com.visibolic.sayit.extensibility.impl;

import com.visibolic.sayit.R;
import com.visibolic.sayit.R.drawable;
import com.visibolic.sayit.extensibility.IMouth;

import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.text.Editable;

public class Mouth implements IMouth{
	int images[] = {
			R.drawable.mouth_rest,
			R.drawable.mouth_ai,
			R.drawable.mouth_cdgknrsyz,
			R.drawable.mouth_e,
			R.drawable.mouth_fv,
			R.drawable.mouth_l_th,
			R.drawable.mouth_mbp,
			R.drawable.mouth_o,
			R.drawable.mouth_u,
			R.drawable.mouth_wq};
	Resources myResources =null; 
	public Mouth(Resources res)
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
    	 	case 'i':
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
    	 	case 'f':
    	 	case 'v':
    	 		return images[4];
    	 	case 'l':
    	 	case 't':
    	 		return images[5];
    	 	case 'm':
    	 	case 'b':
    	 	case 'p':
    	 		return images[6];
    	 	case 'o':
    	 		return images[7];
    	 	case 'u':
    	 		return images[8];
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

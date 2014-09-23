package com.visibolic.sayit;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SayItView3 extends SurfaceView implements SurfaceHolder.Callback{
	 
	private SThread3 thread;
	List <Sprite> mySprites = new ArrayList<Sprite>();
	List <Sprite> mySpritesStopped = new ArrayList<Sprite>();
	int images[] = {R.drawable.mouth_rest,
			R.drawable.mouth_ai,R.drawable.mouth_cdgknrsyz,
			R.drawable.mouth_e,
			R.drawable.mouth_fv,
			R.drawable.mouth_l_th,
			R.drawable.mouth_mbp,
			R.drawable.mouth_o,
			R.drawable.mouth_u,
			R.drawable.mouth_wq};
	boolean myRunning=true;
	synchronized boolean getRunning()
	{
		return myRunning;
	}
	synchronized void toggleRunning()
	{
		myRunning=!myRunning;
	}
 
	public SayItView3 (Context ctx){
		super (ctx);
		getHolder().addCallback(this);
		loadSprites();
		this.thread = new SThread3(getHolder(), this);
		setFocusable(true); // The panel handles the screen touch, so be sure to give it the focus !
		
		
	}
	protected void loadSprites()
	{
		for(int x=0;x<images.length;x++)
		{
			Bitmap b1 = BitmapFactory.decodeResource(getResources(), images[x]);
			Sprite s = new Sprite(b1,0,0);
			mySprites.add(s);
			
		}
		mySpritesStopped.add(mySprites.get(0));
	}
	List <Sprite> getSprites()
	{
		if(getRunning()) return mySprites;
		return mySpritesStopped;
	}
	@Override
	public void onDraw (Canvas canvas){
 
		int centerX = canvas.getWidth() / 2;
		int centerY = canvas.getHeight() / 2;
		canvas.drawColor(Color.WHITE);
		for (Sprite s: getSprites())
		{
			canvas.drawBitmap(s.bitmap, centerX,centerY,null);
			SystemClock.sleep(300);
		}
 	}
 
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == event.ACTION_UP){// when touching and releasing the finger
			synchronized (thread.sfholder)
			{
				this.toggleRunning();
				//this.invalidate();
				
 			}
		}
 
		return true;
	}
 
	public void surfaceCreated(SurfaceHolder arg0) {
		this.thread.start();
	}
 
	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
	}
 
	public void surfaceDestroyed(SurfaceHolder arg0) {
		boolean retry = true;
		this.thread.setRunning(false);
		while (retry){
			try{
				this.thread.join();
				retry = false;
			}catch (InterruptedException ie){
 
			}
		}
	}
 
}
package com.visibolic.sayit.views;

import java.util.ArrayList;

import com.visibolic.sayit.R;
import com.visibolic.sayit.R.drawable;
import com.visibolic.sayit.extensibility.impl.Sprite;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MovingPictureView extends SurfaceView implements SurfaceHolder.Callback{
	 
	private SThread thread;
	public ArrayList<Sprite> sprites=new ArrayList<Sprite>();;
	long lastFPS;
	int fps;
	int frames;
 
	public MovingPictureView (Context ctx){
		super (ctx);
		getHolder().addCallback(this);
		this.thread = new SThread(getHolder(), this);
		setFocusable(true); // The panel handles the screen touch, so be sure to give it the focus !
 
		lastFPS = 0;
		fps = 0;
		frames = 0;
	}
 
	@Override
	public void onDraw (Canvas canvas){
 
			canvas.drawColor(Color.BLACK);
			for (Sprite s: sprites){
				canvas.drawBitmap(s.bitmap, s.x, s.y, null);
				frames++;
			}
 
			long time = System.currentTimeMillis();
			if (time >= lastFPS + 1000){
				fps = frames;
				frames = 0;
				lastFPS = time;
			}
 
			Paint ptext = new Paint();
			ptext.setColor(Color.WHITE);
			String fromattedFPS = fps + " fps + Click on screen to draw an icon";
 
			canvas.drawText(fromattedFPS, 0, fromattedFPS.length(), 10, 10, ptext);
	}
 
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == event.ACTION_UP){// when touching and releasing the finger
			synchronized (thread.sfholder)
			{
				sprites.add(new Sprite(BitmapFactory.decodeResource(getResources(), R.drawable.mouth_o), event.getX(), event.getY()));// drawable/smiley.gif is a smiley image
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
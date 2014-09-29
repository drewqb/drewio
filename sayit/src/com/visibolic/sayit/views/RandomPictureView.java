package com.visibolic.sayit.views;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceView;

import com.visibolic.sayit.R;
import com.visibolic.sayit.extensibility.impl.Sprite;

public class RandomPictureView extends SurfaceView
{
	public ArrayList<Sprite> sprites=new ArrayList<Sprite>();;
	long lastFPS;
	int fps;
	int frames;
	public RandomPictureView (Context ctx){
		super (ctx);
		setFocusable(true); // The panel handles the screen touch, so be sure to give it the focus !
 
		lastFPS = 0;
		fps = 0;
		frames = 0;
		setWillNotDraw(false);
	}
 
	@Override
	public void onDraw (Canvas canvas)
	{
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
			//synchronized (thread.sfholder)
			{
				sprites.add(new Sprite(BitmapFactory.decodeResource(getResources(), R.drawable.mouth_o), event.getX(), event.getY()));// drawable/smiley.gif is a smiley image
				invalidate();
 			}
		}
 
		return true;
	}
 
}
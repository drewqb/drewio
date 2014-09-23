package com.visibolic.sayit;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;

public class SayItView2 extends View
{
	private Animation anim;
	int current=0;
	int images[] = {R.drawable.mouth_rest,
			R.drawable.mouth_ai,R.drawable.mouth_cdgknrsyz,
			R.drawable.mouth_e,
			R.drawable.mouth_fv,
			R.drawable.mouth_l_th,
			R.drawable.mouth_mbp,
			R.drawable.mouth_o,
			R.drawable.mouth_u,
			R.drawable.mouth_wq};
	int images2[] = {
			R.drawable.mouth_fv,
			R.drawable.mouth_fv,
			R.drawable.mouth_fv,
			R.drawable.mouth_u,
			R.drawable.mouth_u,
			R.drawable.mouth_u,
			R.drawable.mouth_cdgknrsyz,
			R.drawable.mouth_cdgknrsyz,
			R.drawable.mouth_rest,
			R.drawable.mouth_cdgknrsyz,
			R.drawable.mouth_u,
			R.drawable.mouth_o};
	List <Sprite> mySprites = new ArrayList<Sprite>();
	List <Sprite> mySpritesStopped = new ArrayList<Sprite>();
	
	boolean myRunning=true;
	synchronized boolean getRunning()
	{
		return myRunning;
	}
	synchronized void toggleRunning()
	{
		myRunning=!myRunning;
	}
	public int getImageIndex()
	{
		if(current >= images2.length-1)
		{
			current=0;
		}
		else
		{
			current++;
		}
		return current;//images2[current];
	}
	protected void loadSprites()
	{
		for(int x=0;x<images2.length;x++)
		{
			Bitmap b1 = BitmapFactory.decodeResource(getResources(), images2[x]);
			Sprite s = new Sprite(b1,0,0);
			mySprites.add(s);
			
		}
		mySpritesStopped.add(mySprites.get(0));
	}
	public SayItView2(Context context) {
		super(context);
		//this.getHolder().addCallback(this);
		setFocusable(true); // The panel handles the screen touch, so be sure to give it the focus !
		loadSprites();
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == event.ACTION_UP)
		{ // when touching and releasing the finger
			toggleRunning();
			this.invalidate();
 		}
 
		return true;
	}
	private void createAnim(Canvas canvas) {
		//anim = new RotateAnimation(0, 0, canvas.getWidth() / 2, canvas.getHeight() / 2);
		anim = new ScaleAnimation(1, 2, 1,2,canvas.getWidth() / 2, canvas.getHeight() / 2);
		anim.setRepeatMode(Animation.START_ON_FIRST_FRAME);
		anim.setRepeatCount(1);
		anim.setDuration(50000L);
		anim.setInterpolator(new LinearInterpolator());
		
		startAnimation(anim);
		
	}
	Sprite getCurrentSprite()
	{
		if(getRunning()) return mySprites.get(this.getImageIndex());
		return mySpritesStopped.get(0);
	}
	List <Sprite> getSprites()
	{
		if(getRunning()) return mySprites;
		return mySpritesStopped;
	}
	protected void onDraw(Canvas canvas) {
		// creates the animation the first time
		if (anim == null) {
			createAnim(canvas);
		}


		int centerX = canvas.getWidth() / 2;
		int centerY = canvas.getHeight() / 2;
		canvas.drawColor(Color.WHITE);
		Sprite s = getCurrentSprite();
		canvas.drawBitmap(s.bitmap, centerX,centerY,null);
		
	}
	

}

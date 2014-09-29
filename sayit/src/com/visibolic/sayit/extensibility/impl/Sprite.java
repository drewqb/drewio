package com.visibolic.sayit.extensibility.impl;

import android.graphics.Bitmap;

public class Sprite {
	 
	public float x;
	public float y;
	public Bitmap bitmap;
 
	public float dirx; // delta x
	public float diry; // delta y
 
	public Sprite (Bitmap bm, float X, float Y){
		this.bitmap = bm;
		this.x = X;
		this.y = Y;
 
		this.dirx = 5;
		this.diry = 5;
	}
 
	public void move(){
		this.x += this.dirx;
		this.y += this.diry;
	}
 
}

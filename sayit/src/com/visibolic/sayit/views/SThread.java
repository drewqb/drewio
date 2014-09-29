package com.visibolic.sayit.views;

import com.visibolic.sayit.extensibility.impl.Sprite;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class SThread extends Thread{
	 
	public SurfaceHolder sfholder;
	private MovingPictureView panel;
	boolean run = false;
 
	public SThread (SurfaceHolder sfh, MovingPictureView pnl){
		this.sfholder = sfh;
		this.panel = pnl;
	}
 
	public void setRunning (boolean toggle){
		this.run = toggle;
	}
 
	@Override
	public void run (){
		Canvas c;
 
		while (this.run){
			c = null;
			try{
				c = this.sfholder.lockCanvas(null);
				synchronized (this.sfholder){
 
					for (Sprite s: this.panel.sprites){ // manage bounding
						s.move();
						if (s.x > this.panel.getWidth() || s.y > this.panel.getHeight()){
							//s.kill = true;
							this.panel.sprites.remove(s);
						}
 
						if (s.x <= 0){
							s.dirx *= -1;
						}
 
						if (s.y <= 0){
							s.diry *= -1;
						}
 
						if ((s.x + s.bitmap.getWidth()) >= this.panel.getWidth()){
							s.dirx *= -1;
						}
 
						if ((s.y + s.bitmap.getHeight()) >= this.panel.getHeight()){
							s.diry *= -1;
						}
 
					}
                                        // tell panel to draw everything
					this.panel.onDraw(c);
					//this.panel.draw(c);
				}
			}finally{
				if (c != null){
					this.sfholder.unlockCanvasAndPost(c);
				}
			}
		}
	}
 
	@Override
	public void start(){
		if (this.run == false){
			this.run = true;
			super.start();
		}
	}
 
}

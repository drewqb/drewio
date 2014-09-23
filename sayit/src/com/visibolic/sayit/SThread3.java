package com.visibolic.sayit;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class SThread3 extends Thread{

	public SurfaceHolder sfholder;
	private SayItView3 panel;
	boolean run = false;

	public SThread3 (SurfaceHolder sfh, SayItView3 pnl){
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

					
					// tell panel to draw everything
					this.panel.onDraw(c);
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

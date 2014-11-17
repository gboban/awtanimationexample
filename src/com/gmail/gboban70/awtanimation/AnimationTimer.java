package com.gmail.gboban70.awtanimation;

import java.awt.Frame;
import java.util.Timer;

public class AnimationTimer extends Timer{
	private Frame frame = null;
	
	public void setFrame(Frame anfrm){
		this.frame = anfrm;
	}
	
	public void start(){
		this.scheduleAtFixedRate(new AnimationTimerTask(frame), 0, 10);
	}
}
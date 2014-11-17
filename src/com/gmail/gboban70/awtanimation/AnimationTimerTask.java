package com.gmail.gboban70.awtanimation;

import java.awt.Frame;
import java.util.TimerTask;

public class AnimationTimerTask extends TimerTask {
	private Frame frame = null;
	
	public AnimationTimerTask(Frame anFrame){
		this.frame = anFrame;
	}
	
	public void run() {
		if(this.frame != null){
			this.frame.paint(this.frame.getGraphics());
		}
	}
}
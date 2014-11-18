package com.gmail.gboban70.awtanimation;

import java.awt.Frame;
import java.awt.event.KeyEvent;

public abstract class AnimationFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public abstract void keyPressed(KeyEvent ke);
}
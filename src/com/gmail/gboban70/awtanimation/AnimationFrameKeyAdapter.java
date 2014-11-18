package com.gmail.gboban70.awtanimation;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AnimationFrameKeyAdapter extends KeyAdapter {
	private Drawable drawable = null;
	
	public Drawable getDrawable() {
		return drawable;
	}

	public void setDrawable(Drawable drawable) {
		this.drawable = drawable;
	}
	
	public void keyPressed(KeyEvent ke){
		AnimationFrame frm = (AnimationFrame)ke.getSource();
		
		int kc = ke.getKeyCode();
		
		frm.keyPressed(ke);
	}
}

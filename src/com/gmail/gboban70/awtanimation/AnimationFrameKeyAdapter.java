package com.gmail.gboban70.awtanimation;

import MasaZombieFrame;

import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AnimationFrameKeyAdapter extends KeyAdapter {
	public void keyPressed(KeyEvent ke){
		AnimationFrame frm = (AnimationFrame)ke.getSource();
		
		int kc = ke.getKeyCode();
		//System.out.println(kc);
		
		frm.keyPressed(ke);
	}
}

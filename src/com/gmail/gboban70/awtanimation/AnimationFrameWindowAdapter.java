package com.gmail.gboban70.awtanimation;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AnimationFrameWindowAdapter extends WindowAdapter {
	
    public void windowClosing (WindowEvent e) {
    	// TODO: add confirm dialog
    	System.exit(0);
    }
    
/*
 * implement for buffered animation
    public void windowActivated(WindowEvent e){
    	Frame f = (Frame)e.getSource();
    	
		f.imgbuffer = f.createImage(this.getWidth(), this.getHeight());
		f.graficsbuffer = f.imgbuffer.getGraphics();
    }
*/
}
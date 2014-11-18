package com.gmail.gboban70.awtanimation;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Drawables {
	private List<Drawable> drawables = null;
	
	public Drawables(){
		this.drawables = new ArrayList<Drawable>();
	}
	
	public List<Drawable> getDrawables(){
		return this.drawables;
	}
	
	public void updateAll(){
		for(Drawable d : this.drawables){
			d.update();
		}
	}
	
	public void drawAll(Graphics g){
		for(Drawable d : this.drawables){
			d.draw(g);
		}
	}
}
package com.gmail.gboban70.awtanimation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class Drawable {
	private Dimension size = new java.awt.Dimension(0, 0);
	private Point position = new java.awt.Point(0, 0);
	private Point velocity = new java.awt.Point(0, 0);
	
	private Color color = new java.awt.Color(0xFF0000);

	public Drawable(Dimension asize, Point pos, Point vel, Color col){
		this.size 		= asize;
		this.position  	= pos;
		this.velocity 	= vel;
		
		this.color = col;
	}
	
	public Drawable(Dimension asize, Point pos, Point vel){
		this.size 		= asize;
		this.position  	= pos;
		this.velocity 	= vel;
	}
	
	public Drawable(Dimension asize, Point pos){
		this.size 		= asize;
		this.position  	= pos;
	}
	
	public Drawable(Dimension asize){
		this.size 		= asize;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public int getX(){
		return this.position.x;
	}
	
	public int getY(){
		return this.position.y;
	}
	
	public int getWidth(){
		return this.size.width;
	}
	
	public int getHeight(){
		return this.size.height;
	}
	
	public Point move(int dx, int dy){
		this.position.x += dx;
		this.position.y += dy;
		
		return this.position;
	}
	
	public Point move(){
		return this.move(this.velocity.x, this.velocity.y);
	}
	
	public void update(){
		/*
		 * default behavior
		 */
		this.move();
	}
	
	public void draw(Graphics g){
		/*
		 * Should know how to draw itself on graphics (canvas)
		 * override for subclasses (e.g: g.drawImage(...)
		 */
		g.setColor(this.color);
		g.drawRect(this.position.x, this.position.y, this.size.width, this.size.height);
	}
}

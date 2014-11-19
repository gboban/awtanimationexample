/**
*
* @author  Goran Boban gboban70(at)gmail.com
* @version 1.0
* @since   2014-11-17 
*/
/**
 * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.gmail.gboban70.awtanimation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.Random;

public class AWTAnimationApp {
	private static Random rand = new Random();
	private AnimationFrame af = null;
	private final static int WWIDTH = 800;
	private final static int WHEIGHT = 600;
	
	
	private class MyKeyAdapter extends AnimationFrameKeyAdapter{
		public void keyPressed(KeyEvent ke){
			int kc = ke.getKeyCode();
			switch(kc){
				case KeyEvent.VK_LEFT:
					this.getDrawable().move(-1, 0);
					break;
				case KeyEvent.VK_RIGHT:
					this.getDrawable().move(1, 0);
					break;
				case KeyEvent.VK_UP:
					this.getDrawable().move(0, -1);
					break;
				case KeyEvent.VK_DOWN:
					this.getDrawable().move(0, 1);
					break;
			}
		}
	}
	
	private void initialize(){
		// create Window Adapter - let it be default one
		AnimationFrameWindowAdapter wa = new AnimationFrameWindowAdapter();
		AnimationFrameKeyAdapter ke = new AWTAnimationApp.MyKeyAdapter();
		
		// create drawables object and add few objects to draw
		Drawables drawables = new Drawables();
		for(int i = 0; i < 5; ++i){
			Drawable d = new Drawable(
						new Dimension(10, 10),
						new Point(rand.nextInt(WWIDTH), rand.nextInt(WHEIGHT)),
						new Point(rand.nextInt(10) - 5, rand.nextInt(10) - 5),
						new Color(0xff0000)
					);
			if(i==0){
				ke.setDrawable(d);
			}
		}
		
		this.af = new AnimationFrame();
		this.af.setWinAdapter(wa);
		this.af.setKeyAdapter(ke);
		this.af.setDrawables(drawables);
		
		this.af.setSize(new Dimension(WWIDTH, WHEIGHT));

	}
	
	protected void run(){
		// create form and run timers here
		AnimationTimer timer = new AnimationTimer();
		this.af.setVisible(true);
		timer.start();
		
	}
	
	public static void main(String[] args) {

		AWTAnimationApp app = new AWTAnimationApp();
		app.initialize();
		app.run();
		System.out.println("END");
	}
}

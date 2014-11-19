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

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.util.Timer;

public class AnimationFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private WindowAdapter winAdapter = null;
	private KeyAdapter keyAdapter = null;
	private Drawables drawables = null;
	
	private Timer timer = null;

	public WindowAdapter getWinAdapter() {
		return winAdapter;
	}

	public void setWinAdapter(WindowAdapter winAdapter) {
		this.winAdapter = winAdapter;
		this.addWindowListener(winAdapter);
	}

	public KeyAdapter getKeyAdapter() {
		return keyAdapter;
	}

	public void setKeyAdapter(KeyAdapter keyAdapter) {
		this.keyAdapter = keyAdapter;
		this.addKeyListener(keyAdapter);
	}

	public Drawables getDrawables() {
		return drawables;
	}

	public void setDrawables(Drawables drawables) {
		this.drawables = drawables;
	}

	public Timer getTimer() {
		return timer;
	}


	public void setTimer(Timer timer) {
		this.timer = timer;
	}
	
	public void keyPressed(KeyEvent ke){
		// do nothing
		assert true;
	}
	
	protected void update(){
		this.drawables.updateAll();
	}

	@Override
	public void paint(Graphics g){
		this.drawables.drawAll(g);
	}
}
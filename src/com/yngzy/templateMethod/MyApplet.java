package com.yngzy.templateMethod;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * @author Young
 *
 * @date 2016年3月1日下午10:38:21
 *
 * @Title MyApplet.java
 */
public class MyApplet extends Applet {
	String message;
	
	/* 
	 * @see java.applet.Applet#init()
	 */
	@Override
	public void init() {
		
		this.message="Hello world,I'm alive";
		repaint();
	}
	
	/* 
	 * @see java.applet.Applet#start()
	 */
	@Override
	public void start() {
		this.message="Now I'm starting up";
		repaint();
		
	}

	/* 
	 * @see java.applet.Applet#stop()
	 */
	@Override
	public void stop() {
		
		this.message="Oh,now I'm being stopped....";
		repaint();
	}
	
	/* 
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		
		g.drawString(message, 5, 15);
	}
}

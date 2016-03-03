package com.yngzy.templateMethod;

import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * @author Young
 *
 * @date 2016年3月1日下午10:38:04
 *
 * @Title MyFrame.java
 */
public class MyFrame extends JFrame{
	
	public MyFrame(String title) {
		super(title);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	/* 
	 * @see java.awt.Window#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		String msg = "I rule!!";
		g.drawString(msg, 100, 100);
	}
	
}

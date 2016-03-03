package com.yngzy.observer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @Title:SwingObserverExample.java
 *
 * @author Young
 *
 *	@date 2016-2-17 下午12:30:07
 *
 * @Copyright:Copyright(c) 2016
 */
public class SwingObserverExample {
	private JFrame frame;
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	public void go(){
	/*	frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);*/
	}
	
	class AngelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do it,you might regret it");
		}
		
	}
	
	class DevilListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on ,do it!");
		}
		
	}
}

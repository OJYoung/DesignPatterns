package com.yngzy.strategy;

/**
 * @Title:MallardDuck.java
 *
 * @author Young
 *
 *	@date 2016-1-23 下午07:47:21
 *
 * @Copyright:Copyright(c) 2016
 */
public class MallardDuck extends Duck {

	/**
	 * 
	 */
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
		
	}
	public void display() {
		System.out.println("I am a real mallard duck");
	}

}

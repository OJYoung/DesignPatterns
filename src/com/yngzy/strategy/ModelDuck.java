package com.yngzy.strategy;

/**
 * @Title:ModelDuck.java
 *
 * @author Young
 *
 *	@date 2016-1-23 下午07:55:46
 *
 * @Copyright:Copyright(c) 2016
 */
public class ModelDuck extends Duck{

	/**
	 * 
	 */
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("I am a model duck");
	}

}

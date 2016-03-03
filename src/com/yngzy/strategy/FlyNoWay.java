package com.yngzy.strategy;

/**
 * @Title:FlyNoWay.java
 *
 * @author Young
 *
 *	@date 2016-1-23 下午07:43:10
 *
 * @Copyright:Copyright(c) 2016
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly.");
	}

}

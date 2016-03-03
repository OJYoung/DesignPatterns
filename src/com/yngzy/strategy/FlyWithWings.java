package com.yngzy.strategy;

/**
 * @Title:FlayWithWings.java
 *
 * @author Young
 *
 *	@date 2016-1-23 下午07:41:53
 *
 * @Copyright:Copyright(c) 2016
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can flying with wings!");
	}

}

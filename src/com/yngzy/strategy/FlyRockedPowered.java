package com.yngzy.strategy;

/**
 * @Title:FlyRockedPowerd.java
 *
 * @author Young
 *
 *	@date 2016-1-23 下午07:57:56
 *
 * @Copyright:Copyright(c) 2016
 */
public class FlyRockedPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}

}

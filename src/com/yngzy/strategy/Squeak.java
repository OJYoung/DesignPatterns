package com.yngzy.strategy;

/**
 * @Title:Squeak.java
 *
 * @author Young
 *
 *	@date 2016-1-23 下午07:45:09
 *
 * @Copyright:Copyright(c) 2016
 */
public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak~~~~~!");
	}

}

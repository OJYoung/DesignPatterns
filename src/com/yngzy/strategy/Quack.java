package com.yngzy.strategy;

/**
 * @Title:Quack.java
 *
 * @author Young
 *
 *	@date 2016-1-23 下午07:43:54
 *
 * @Copyright:Copyright(c) 2016
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack~~~!");
	}

}

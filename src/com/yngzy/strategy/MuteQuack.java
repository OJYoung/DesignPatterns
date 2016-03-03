package com.yngzy.strategy;

/**
 * @Title:MuteQuack.java
 *
 * @author Young
 *
 *	@date 2016-1-23 下午07:44:34
 *
 * @Copyright:Copyright(c) 2016
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}

package com.yngzy.adapter;

import com.yngzy.adapter.interfaces.Duck;

/**
 * @author Young
 *
 * @date 2016年2月29日下午9:10:29
 *
 * @Title MallardDuck.java
 */
public class MallardDuck implements Duck {

	/* 
	 * @see com.yngzy.adapter.interfaces.Duck#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Quck");
	}

	/* 
	 * @see com.yngzy.adapter.interfaces.Duck#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}

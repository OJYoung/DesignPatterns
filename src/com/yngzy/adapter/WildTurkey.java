package com.yngzy.adapter;

import com.yngzy.adapter.interfaces.Turkey;

/**
 * @author Young
 *
 * @date 2016年2月29日下午9:07:06
 *
 * @Title WildTurkey.java
 */
public class WildTurkey implements Turkey {

	/* 
	 * @see com.yngzy.adapter.interfaces.Turkey#gobble()
	 */
	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	/* 
	 * @see com.yngzy.adapter.interfaces.Turkey#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}

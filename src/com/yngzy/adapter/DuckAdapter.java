package com.yngzy.adapter;

import java.util.Random;

import com.yngzy.adapter.interfaces.Duck;
import com.yngzy.adapter.interfaces.Turkey;

/**
 * @author Young
 *
 * @date 2016年2月29日下午9:23:31
 *
 * @Title DuckAdapter.java
 */
public class DuckAdapter implements Turkey{

	private Duck duck;
	private Random rand;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		this.rand = new Random();
	}
	/* 
	 * @see com.yngzy.adapter.interfaces.Turkey#gobble()
	 */
	@Override
	public void gobble() {
		duck.quack();
	}

	/* 
	 * @see com.yngzy.adapter.interfaces.Turkey#fly()
	 */
	@Override
	public void fly() {
		if(rand.nextInt(5)==0){
			duck.fly();
		}
		
	}

}

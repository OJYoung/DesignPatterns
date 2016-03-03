package com.yngzy.decorator;

/**
 * @Title:Espresso.java
 *
 * @author Young
 *
 *	@date 2016-2-15 下午09:50:28
 *
 * @Copyright:Copyright(c) 2016
 */
public class Espresso extends Beverage {
	@Override
	public double cost() {
		return 2.0;
	}
	
	/**
	 * 
	 */
	public Espresso(int size) {
		this.size=size;
		this.description=getDescription()+" Espresso";
	}
}

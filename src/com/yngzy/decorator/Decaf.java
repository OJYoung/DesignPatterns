package com.yngzy.decorator;

/**
 * @Title:Decaf.java
 *
 * @author Young
 *
 *	@date 2016-2-15 下午09:52:00
 *
 * @Copyright:Copyright(c) 2016
 */
public class Decaf extends Beverage{

	@Override
	public double cost() {
		return 1.5;
	}

	/**
	 * 
	 */
	public Decaf(int size) {
		this.description+=" Decaf";
		this.size=size;
	}
}

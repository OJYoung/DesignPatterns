package com.yngzy.decorator;

/**
 * @Title:DarkRoast.java
 *
 * @author Young
 *
 *	@date 2016-2-15 下午09:49:32
 *
 * @Copyright:Copyright(c) 2016
 */
public class DarkRoast extends Beverage{

	@Override
	public double cost() {
		return 1.2;
	}

	public DarkRoast(int size) {
		this.description+=" DarkRoast";
		this.size=size;
	}

	
	
}

package com.yngzy.decorator;

/**
 * @Title:HouseBlend.java
 *
 * @author Young
 *
 *	@date 2016-2-15 下午09:48:11
 *
 * @Copyright:Copyright(c) 2016
 */
public class HouseBlend extends Beverage {

	private double cost;
	/**
	 * 
	 */
	public HouseBlend(int size) {
		switch (size) {
		case Beverage.TALL:
			this.description="Tall HouseBlend";
			this.cost=1.1;
			break;
		case Beverage.GRANDE:
			this.description="Grande HouseBlend";
			this.cost=1.2;
			break;
		case Beverage.VENTI:
			this.description="Venti HouseBlend";
			this.cost=1.3;
			break;
		}
	}
	
	@Override
	public double cost() {
		return cost;
	}
}

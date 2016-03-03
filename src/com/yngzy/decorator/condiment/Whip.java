package com.yngzy.decorator.condiment;

import com.yngzy.decorator.Beverage;
import com.yngzy.decorator.CondimentDecorator;

/**
 * @Title:Whip.java
 *
 * @author Young
 *
 *	@date 2016-2-15 下午10:05:26
 *
 * @Copyright:Copyright(c) 2016
 */
public class Whip extends CondimentDecorator{
	private Beverage beverage;
	/**
	 * 
	 */
	public Whip(Beverage beverage) {
		this.beverage= beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" ,Whip";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.30;
	}

}

package com.yngzy.decorator.condiment;

import com.yngzy.decorator.Beverage;
import com.yngzy.decorator.CondimentDecorator;

/**
 * @Title:Soy.java
 *
 * @author Young
 *
 *	@date 2016-2-15 下午10:04:00
 *
 * @Copyright:Copyright(c) 2016
 */
public class Soy extends CondimentDecorator{
	private Beverage beverage;
	
	/**
	 * 
	 */
	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Soy";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.15;
	}

}

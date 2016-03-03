package com.yngzy.decorator.condiment;

import com.yngzy.decorator.Beverage;
import com.yngzy.decorator.CondimentDecorator;

/**
 * @Title:Mocha.java
 *
 * @author Young
 *
 *	@date 2016-2-15 下午10:01:36
 *
 * @Copyright:Copyright(c) 2016
 */
public class Mocha extends CondimentDecorator{
	private Beverage beverage;
	
	/**
	 * 
	 */
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+" ,Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.20;
	}

}

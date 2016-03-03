package com.yngzy.decorator.test;

import com.yngzy.decorator.Beverage;
import com.yngzy.decorator.HouseBlend;
import com.yngzy.decorator.condiment.Mocha;
import com.yngzy.decorator.condiment.Soy;

/**
 * @Title:StarbuzzCoffee.java
 *
 * @author Young
 *
 *	@date 2016-2-15 下午10:16:08
 *
 * @Copyright:Copyright(c) 2016
 */
public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new HouseBlend(3);
		
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		
		
		beverage = new Soy(beverage);
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		
		
		/*beverage = new Mocha(beverage);
		
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		*/
	}

}

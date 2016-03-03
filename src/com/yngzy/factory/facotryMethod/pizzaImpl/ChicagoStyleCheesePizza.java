package com.yngzy.factory.facotryMethod.pizzaImpl;

import com.yngzy.factory.facotryMethod.Pizza;

/**
 * @Title:ChicagoStyleCheesePizza.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午02:20:18
 *
 * @Copyright:Copyright(c) 2016
 */
public class ChicagoStyleCheesePizza extends Pizza {

	/**
	 * 
	 */
	public ChicagoStyleCheesePizza() {
		this.name=" Chicago style Deep Dish Cheese Pizza";
		this.dough="Extra Thick Crust Dough";
		this.sauce="Plum Tomato Sauce";
		this.toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}

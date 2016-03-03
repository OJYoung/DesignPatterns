package com.yngzy.factory.facotryMethod.pizzaImpl;

import com.yngzy.factory.facotryMethod.Pizza;

/**
 * @Title:NYStyleCheesePizza.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午02:16:43
 *
 * @Copyright:Copyright(c) 2016
 */
public class NYStyleCheesePizza extends Pizza {

	/**
	 * 
	 */
	public NYStyleCheesePizza() {
		this.name=" NY style Sauce and Cheese Pizza";
		this.dough="Thin Crust Dough";
		this.sauce="Marina Sauce";
		this.toppings.add("Grated Reggiano Cheese");
	}
	
}

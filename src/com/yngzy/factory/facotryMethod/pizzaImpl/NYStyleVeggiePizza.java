package com.yngzy.factory.facotryMethod.pizzaImpl;

import com.yngzy.factory.facotryMethod.Pizza;

/**
 * @Title:NYStyleVeggiePizza.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午02:18:31
 *
 * @Copyright:Copyright(c) 2016
 */
public class NYStyleVeggiePizza extends Pizza {
	/**
	 * 
	 */
	public NYStyleVeggiePizza() {
		this.name=" NY style Sauce and veggie Pizza";
		this.dough="Thin Crust Dough";
		this.sauce="Marina Sauce";
		this.toppings.add("Grated Reggiano veggie");
	}

}

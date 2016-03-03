package com.yngzy.factory.facotryMethod.pizzaImpl;

import com.yngzy.factory.facotryMethod.Pizza;

/**
 * @Title:NYStylePepperoniPizza.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午02:17:48
 *
 * @Copyright:Copyright(c) 2016
 */
public class NYStylePepperoniPizza extends Pizza {

	/**
	 * 
	 */
	public NYStylePepperoniPizza() {
		this.name=" NY style Sauce and Pepperoni Pizza";
		this.dough="Thin Crust Dough";
		this.sauce="Marina Sauce";
		this.toppings.add("Grated Reggiano Pepperoni");
	}

}

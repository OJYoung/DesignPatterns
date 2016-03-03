package com.yngzy.factory.facotryMethod.pizzaImpl;

import com.yngzy.factory.facotryMethod.Pizza;

/**
 * @Title:NYStyleClamPizza.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午02:18:12
 *
 * @Copyright:Copyright(c) 2016
 */
public class NYStyleClamPizza extends Pizza {

	/**
	 * 
	 */
	public NYStyleClamPizza() {
		this.name=" NY style Sauce and clam Pizza";
		this.dough="Thin Crust Dough";
		this.sauce="Marina Sauce";
		this.toppings.add("Grated Reggiano clam");
	}
	

}

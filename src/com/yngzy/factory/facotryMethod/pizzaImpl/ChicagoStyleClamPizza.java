package com.yngzy.factory.facotryMethod.pizzaImpl;

import com.yngzy.factory.facotryMethod.Pizza;

/**
 * @Title:ChicagoStyleClamPizza.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午02:21:05
 *
 * @Copyright:Copyright(c) 2016
 */
public class ChicagoStyleClamPizza extends Pizza {

	/**
	 * 
	 */
	public ChicagoStyleClamPizza() {
		this.name=" Chicago style clam Pizza";
		this.dough="Extra Thick Crust Dough";
		this.sauce="Plum Tomato Sauce";
		this.toppings.add("Shredded Mozzarella Cheese");
	}
}

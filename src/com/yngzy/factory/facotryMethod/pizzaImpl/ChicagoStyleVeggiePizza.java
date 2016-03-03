package com.yngzy.factory.facotryMethod.pizzaImpl;

import com.yngzy.factory.facotryMethod.Pizza;

/**
 * @Title:ChicagoStyleVeggiePizza.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午02:21:27
 *
 * @Copyright:Copyright(c) 2016
 */
public class ChicagoStyleVeggiePizza extends Pizza {
	/**
	 * 
	 */
	public ChicagoStyleVeggiePizza() {
		this.name=" Chicago style veggie Pizza";
		this.dough="Extra Thick Crust Dough";
		this.sauce="Plum Tomato Sauce";
		this.toppings.add("Shredded Mozzarella Cheese");
	}
}

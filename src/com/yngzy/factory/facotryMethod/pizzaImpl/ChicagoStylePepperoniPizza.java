package com.yngzy.factory.facotryMethod.pizzaImpl;

import com.yngzy.factory.facotryMethod.Pizza;

/**
 * @Title:ChicagoStylePepperoniPizza.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午02:20:43
 *
 * @Copyright:Copyright(c) 2016
 */
public class ChicagoStylePepperoniPizza extends Pizza {
	/**
	 * 
	 */
	public ChicagoStylePepperoniPizza() {
		this.name=" Chicago style Pepperoni Pizza";
		this.dough="Extra Thick Crust Dough";
		this.sauce="Plum Tomato Sauce";
		this.toppings.add("Shredded Mozzarella Cheese");
	}

}

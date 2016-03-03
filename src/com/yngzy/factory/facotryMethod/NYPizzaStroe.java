package com.yngzy.factory.facotryMethod;

import com.yngzy.factory.facotryMethod.pizzaImpl.NYStyleCheesePizza;
import com.yngzy.factory.facotryMethod.pizzaImpl.NYStyleClamPizza;
import com.yngzy.factory.facotryMethod.pizzaImpl.NYStylePepperoniPizza;
import com.yngzy.factory.facotryMethod.pizzaImpl.NYStyleVeggiePizza;

/**
 * @Title:NYPizzaStroe.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午02:10:58
 *
 * @Copyright:Copyright(c) 2016
 */
public class NYPizzaStroe extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch(type){
		case "cheese":
			pizza=new NYStyleCheesePizza();
			break;
		case "pepperoni":
			pizza=new NYStylePepperoniPizza();
			break;
		case "clam":
			pizza=new NYStyleClamPizza();
			break;
		case "veggie":
			pizza=new NYStyleVeggiePizza();
			break;
		}
		return pizza;
	}

}

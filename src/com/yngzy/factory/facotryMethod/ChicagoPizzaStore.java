package com.yngzy.factory.facotryMethod;

import com.yngzy.factory.facotryMethod.pizzaImpl.ChicagoStyleCheesePizza;
import com.yngzy.factory.facotryMethod.pizzaImpl.ChicagoStyleClamPizza;
import com.yngzy.factory.facotryMethod.pizzaImpl.ChicagoStylePepperoniPizza;
import com.yngzy.factory.facotryMethod.pizzaImpl.ChicagoStyleVeggiePizza;

/**
 * @Title:ChicagoPizzaStore.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午02:11:19
 *
 * @Copyright:Copyright(c) 2016
 */
public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch(type){
		case "cheese":
			pizza=new ChicagoStyleCheesePizza();
			break;
		case "pepperoni":
			pizza=new ChicagoStylePepperoniPizza();
			break;
		case "clam":
			pizza=new ChicagoStyleClamPizza();
			break;
		case "veggie":
			pizza=new ChicagoStyleVeggiePizza();
			break;
		}
		return pizza;
	}

}

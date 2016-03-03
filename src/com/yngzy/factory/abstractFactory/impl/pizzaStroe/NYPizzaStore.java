package com.yngzy.factory.abstractFactory.impl.pizzaStroe;

import com.yngzy.factory.abstractFactory.Pizza;
import com.yngzy.factory.abstractFactory.PizzaIngredientFactory;
import com.yngzy.factory.abstractFactory.PizzaStore;
import com.yngzy.factory.abstractFactory.impl.pizza.CheesePizza;
import com.yngzy.factory.abstractFactory.impl.pizza.ClamsPizza;
import com.yngzy.factory.abstractFactory.impl.pizzaIngredientFactory.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore{

	
	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		switch(type){
		case "cheese":
			pizza=new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
			break;
		case "pepperoni":
			//pizza=new Pepp
			break;
		case "clam":
			pizza=new ClamsPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
			break;
		case "veggie":
			//pizza=new NYStyleVeggiePizza();
			break;
		}
		return pizza;
	}

}

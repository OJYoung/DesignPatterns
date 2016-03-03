package com.yngzy.factory.abstractFactory.impl.pizza;

import com.yngzy.factory.abstractFactory.Pizza;
import com.yngzy.factory.abstractFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{

	public PizzaIngredientFactory ingredientFactory;
	
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory=ingredientFactory;
	}
	@Override
	public void prepare() {
		System.out.println("Preparing "+name);
		this.dough=ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.cheese = ingredientFactory.createCheese();
	}

}

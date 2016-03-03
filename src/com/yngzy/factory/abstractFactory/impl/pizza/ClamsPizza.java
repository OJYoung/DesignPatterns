package com.yngzy.factory.abstractFactory.impl.pizza;

import com.yngzy.factory.abstractFactory.Pizza;
import com.yngzy.factory.abstractFactory.PizzaIngredientFactory;

public class ClamsPizza extends Pizza{
public PizzaIngredientFactory ingredientFactory;
	
	
	public ClamsPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory=ingredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing "+name);
		this.dough=ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.cheese = ingredientFactory.createCheese();
		this.clams = ingredientFactory.CreateClams();
	}

}

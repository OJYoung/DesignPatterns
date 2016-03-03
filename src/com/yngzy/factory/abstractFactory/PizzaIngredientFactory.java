package com.yngzy.factory.abstractFactory;

public interface PizzaIngredientFactory {
	public Dough createDough();
	
	public Cheese createCheese();
	
	public Sauce createSauce();
	
	public Clams CreateClams();
	
	public Veggies[] createVeggies();
	
	public Pepperoni createPepperoni();
}

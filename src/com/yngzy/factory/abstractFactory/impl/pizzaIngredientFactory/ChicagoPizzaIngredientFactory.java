package com.yngzy.factory.abstractFactory.impl.pizzaIngredientFactory;

import com.yngzy.factory.abstractFactory.Cheese;
import com.yngzy.factory.abstractFactory.Clams;
import com.yngzy.factory.abstractFactory.Dough;
import com.yngzy.factory.abstractFactory.Pepperoni;
import com.yngzy.factory.abstractFactory.PizzaIngredientFactory;
import com.yngzy.factory.abstractFactory.Sauce;
import com.yngzy.factory.abstractFactory.Veggies;
import com.yngzy.factory.abstractFactory.impl.Dough.ThickCrustDough;
import com.yngzy.factory.abstractFactory.impl.Pepperoni.SlicedPepperoin;
import com.yngzy.factory.abstractFactory.impl.cheese.Mozzarella;
import com.yngzy.factory.abstractFactory.impl.clams.FrozenClams;
import com.yngzy.factory.abstractFactory.impl.sauce.PlumTomatoSauce;
import com.yngzy.factory.abstractFactory.impl.veggies.BlackOlives;
import com.yngzy.factory.abstractFactory.impl.veggies.EggPlant;
import com.yngzy.factory.abstractFactory.impl.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new Mozzarella();
	}

	@Override
	public Clams CreateClams() {
		// TODO Auto-generated method stub
		return new FrozenClams();
	}

	@Override
	public Veggies[] createVeggies() {
		 Veggies[] veggies = {new BlackOlives(),new Spinach(),new EggPlant()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoin();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

}

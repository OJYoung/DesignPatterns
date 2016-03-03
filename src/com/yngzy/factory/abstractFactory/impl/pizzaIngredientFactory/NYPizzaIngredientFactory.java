package com.yngzy.factory.abstractFactory.impl.pizzaIngredientFactory;

import com.yngzy.factory.abstractFactory.Cheese;
import com.yngzy.factory.abstractFactory.Clams;
import com.yngzy.factory.abstractFactory.Dough;
import com.yngzy.factory.abstractFactory.Pepperoni;
import com.yngzy.factory.abstractFactory.PizzaIngredientFactory;
import com.yngzy.factory.abstractFactory.Sauce;
import com.yngzy.factory.abstractFactory.Veggies;
import com.yngzy.factory.abstractFactory.impl.Dough.ThinCrustDough;
import com.yngzy.factory.abstractFactory.impl.Pepperoni.SlicedPepperoin;
import com.yngzy.factory.abstractFactory.impl.cheese.ReggianoCheese;
import com.yngzy.factory.abstractFactory.impl.clams.FreshClams;
import com.yngzy.factory.abstractFactory.impl.sauce.MarinaraSauce;
import com.yngzy.factory.abstractFactory.impl.veggies.Garlic;
import com.yngzy.factory.abstractFactory.impl.veggies.Mushroom;
import com.yngzy.factory.abstractFactory.impl.veggies.Onion;
import com.yngzy.factory.abstractFactory.impl.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Clams CreateClams() {
		return new FreshClams();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoin();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

}

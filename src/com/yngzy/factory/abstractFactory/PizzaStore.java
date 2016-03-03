package com.yngzy.factory.abstractFactory;

/**
 * @Title:PizzaStore.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午02:06:11
 *
 * @Copyright:Copyright(c) 2016
 */
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type){
		Pizza pizza = null;
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public  abstract Pizza createPizza(String type);
}

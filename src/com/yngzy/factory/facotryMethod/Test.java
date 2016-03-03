package com.yngzy.factory.facotryMethod;

/**
 * @Title:Test.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午03:10:06
 *
 * @Copyright:Copyright(c) 2016
 */
public class Test {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStroe();
		nyPizzaStore.orderPizza("cheese");
		System.out.println("----------------------");
		PizzaStore chicagoPizzeStore = new ChicagoPizzaStore();
		chicagoPizzeStore.orderPizza("cheese");
	}
	
}

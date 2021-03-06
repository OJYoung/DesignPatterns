package com.yngzy.factory.facotryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title:Pizza.java
 *
 * @author Young
 *
 *	@date 2016-2-20 下午01:56:47
 *
 * @Copyright:Copyright(c) 2016
 */
public abstract class Pizza {
	
	public String name;
	
	public String dough;
	
	public String sauce;
	
	public List<String> toppings = new ArrayList<String>();
	
	public void prepare(){
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce ");
		System.out.println("Adding toppings:");
		for(String topping:toppings){
			System.out.print(" "+topping);
		}
	}
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName(){
		return name;
	}
}

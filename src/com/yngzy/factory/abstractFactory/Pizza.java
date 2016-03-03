package com.yngzy.factory.abstractFactory;

public abstract class Pizza {
	public String name;
	public Dough dough;
	public Sauce sauce;
	public Veggies[] veggies;
	public Cheese cheese;
	public Pepperoni pepperoin;
	public Clams clams;
	
	public abstract void prepare();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

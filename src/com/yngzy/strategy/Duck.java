
package com.yngzy.strategy;

/**
 * @Title:Duck.java
 *
 * @author Young
 *
 *	@date 2016-1-23 下午07:33:07
 *
 * @Copyright:Copyright(c) 2016
 */
public abstract class Duck {
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	
	
	public abstract void display();
	
	
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}



	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}



	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}



	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}



	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float,even decoys!");
	}
}

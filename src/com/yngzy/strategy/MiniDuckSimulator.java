package com.yngzy.strategy;

/**
 * @Title:MiniDuckSimulator.java
 *
 * @author Young
 *
 *	@date 2016-1-23 下午07:45:51
 *
 * @Copyright:Copyright(c) 2016
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.display();
		
		System.out.println("-------------------------");
		Duck modelDuck = new ModelDuck();
		FlyBehavior flyBehavior = new FlyRockedPowered();
		modelDuck.setFlyBehavior(flyBehavior);
		modelDuck.performFly();
		modelDuck.performQuack();
		modelDuck.display();
		
	}

}

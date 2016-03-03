package com.yngzy.adapter.test;

import com.yngzy.adapter.MallardDuck;
import com.yngzy.adapter.TurkeyAdapter;
import com.yngzy.adapter.WildTurkey;
import com.yngzy.adapter.interfaces.Duck;

/**
 * @author Young
 *
 * @date 2016年2月29日下午9:12:14
 *
 * @Title DuckTestDrive.java
 */
public class DuckTestDrive {

	/**
	 * Title:@param args
	 */
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		testDuck(duck);
		
		System.out.println("---------------");
		Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		testDuck(turkeyAdapter);
		
		
	}
	
	private static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}

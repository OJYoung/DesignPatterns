package com.yngzy.adapter.test;

import com.yngzy.adapter.DuckAdapter;
import com.yngzy.adapter.MallardDuck;
import com.yngzy.adapter.WildTurkey;
import com.yngzy.adapter.interfaces.Turkey;

/**
 * @author Young
 *
 * @date 2016年2月29日下午9:26:03
 *
 * @Title TurkeyTestDrive.java
 */
public class TurkeyTestDrive {

	/**
	 * Title:@param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
		System.out.println("============================="+i);
		Turkey turkey = new WildTurkey();
		testTurkey(turkey);
		System.out.println("----------------------------");
		turkey = new DuckAdapter(new MallardDuck());
		testTurkey(turkey);
		}
		
	}

	private static void testTurkey(Turkey turkey ){
		turkey.gobble();
		turkey.fly();
	}
}

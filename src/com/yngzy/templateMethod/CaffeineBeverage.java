package com.yngzy.templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Young
 *
 * @date 2016年3月1日下午9:40:02
 *
 * @Title CaffeineBeverage.java
 */
public abstract class CaffeineBeverage {
	/**
	 * Title:声明成final，子类不能覆盖次方法
	 */
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}

	/**
	 * Title:@return
	 */
	private boolean customerWantsCondiments() {
		String answer = getUserInput();
		boolean rtn=false;
		switch(answer.toLowerCase()){
		case "y": 
			rtn=true;
			break;
		default:
			rtn=false;
		}
		return rtn;
	}

	/**
	 * Title:@return
	 */
	private String getUserInput() {
		String answer=null;
		System.out.println("would you like milk and sugar with you coffee (y/n) ?");
		
		Scanner scanner = new Scanner(System.in);
		answer=scanner.nextLine();
		/*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer = in.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}*/
		if(answer==null)
			answer="no";
		return answer;
	}

	/**
	 * Title:设置成抽象方法，有子类来实现
	 */
	public abstract void addCondiments();

	/**
	 * Title:
	 */
	private void pourInCup() {
		System.out.println("Pouring into cup");
	}

	/**
	 * Title:设置成抽象方法，有子类来实现
	 */
	public abstract void brew();

	/**
	 * Title:
	 */
	private void boilWater() {
		System.out.println("Boilling water");
	}
}

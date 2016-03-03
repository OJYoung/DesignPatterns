package com.yngzy.templateMethod;

/**
 * @author Young
 *
 * @date 2016年3月1日下午9:34:57
 *
 * @Title Coffee.java
 */
public class Coffee extends CaffeineBeverage{

	/* 
	 * @see com.yngzy.templateMethod.CaffeineBeverage#addCondiments()
	 */
	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	/* 
	 * @see com.yngzy.templateMethod.CaffeineBeverage#brew()
	 */
	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

}

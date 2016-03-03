package com.yngzy.templateMethod;

/**
 * @author Young
 *
 * @date 2016年3月1日下午9:45:08
 *
 * @Title Tea.java
 */
public class Tea extends CaffeineBeverage{

	/* 
	 * @see com.yngzy.templateMethod.CaffeineBeverage#addCondiments()
	 */
	@Override
	public void addCondiments() {
		System.out.println("Add lemon");
	}

	/* 
	 * @see com.yngzy.templateMethod.CaffeineBeverage#brew()
	 */
	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}

}

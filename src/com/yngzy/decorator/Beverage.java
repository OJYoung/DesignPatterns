package com.yngzy.decorator;

/**
 * @Title:Beverage.java
 *
 * @author Young
 *
 *	@date 2016-2-15 下午09:44:57
 *
 * @Copyright:Copyright(c) 2016
 */
public abstract class Beverage {
	public String description="Unkown Beverage";
	public int size;
	
	public static final int TALL=1;
	public static final int GRANDE=2;
	public static final int VENTI=3;
	
	
	public  int getSize(){
		return size;
	}
	
	
	public abstract double cost();
	
	public String getDescription(){
		return description;
	}
}

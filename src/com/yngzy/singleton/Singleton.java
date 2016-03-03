package com.yngzy.singleton;

/**
 * @author Young
 *
 * @date 2016年2月25日下午11:59:42
 *
 * @Title Singleton.java
 */
public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {}
	
	public static Singleton getInstance(){
		if(uniqueInstance==null)
			uniqueInstance = new Singleton();
		
		return uniqueInstance;
	}

}

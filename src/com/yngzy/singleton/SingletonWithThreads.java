package com.yngzy.singleton;

/**
 * @author Young
 *
 * @date 2016年2月26日上午12:01:35
 *
 * @Title SingletonWithThreads.java
 */
public class SingletonWithThreads {
	private static SingletonWithThreads uniqueInstance;
	
	private  SingletonWithThreads() {
	}

	public synchronized static SingletonWithThreads getInstance(){
		if(uniqueInstance==null)
			uniqueInstance = new SingletonWithThreads();
		
		return uniqueInstance;
	}
}

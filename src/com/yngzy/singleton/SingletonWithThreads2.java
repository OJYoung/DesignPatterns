package com.yngzy.singleton;

/**
 * @author Young
 *
 * @date 2016年2月26日上午12:03:32
 *
 * @Title 双重检查加锁  java 5
 */
public class SingletonWithThreads2 {
	/*
	 * volatile关键字确保：当uniqueInstance变量被初始化成singleton实例时，
	  	多个线程正确的处理uniqueInstance变量
	 */
	private volatile static SingletonWithThreads2 uniqueInstance;
	
	private SingletonWithThreads2() {
	}

	public  static SingletonWithThreads2 getInstance(){
		if(uniqueInstance==null){
			synchronized (SingletonWithThreads2.class) {
				if(uniqueInstance==null){
					uniqueInstance = new SingletonWithThreads2();
				}
			}
		}
		
		return uniqueInstance;
	}
}

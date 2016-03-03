package com.yngzy.singleton;

/**
 * @author Young
 *
 * @date 2016年2月26日上午12:05:50
 *
 * @Title 急切实例化
 */
public class Singleton2 {
	private static Singleton2 instance = new Singleton2();

	private Singleton2() {
	}

	public static Singleton2 getInstance(){
		return instance;
	}
}

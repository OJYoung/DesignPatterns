package com.yngzy.observer.interfaces;

/**
 * @Title:Subject.java
 *
 * @author Young
 *
 *	@date 2016-2-17 上午11:14:12
 *
 * @Copyright:Copyright(c) 2016
 */
public interface Subject {
	//注册观察者
	public void registerObserver(Observer o);
	//删除观察者
	public void removeObserver(Observer o);
	//通知观察者
	public void nodifyObservers();
	
}

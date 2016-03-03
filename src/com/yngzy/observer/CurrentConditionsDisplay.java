package com.yngzy.observer;

import com.yngzy.observer.interfaces.DisplayEmenet;
import com.yngzy.observer.interfaces.Observer;
import com.yngzy.observer.interfaces.Subject;

/**
 * @Title:CurrentConditionsDisplay.java
 *
 * @author Young
 *
 *	@date 2016-2-17 上午11:31:53
 *
 * @Copyright:Copyright(c) 2016
 */
public class CurrentConditionsDisplay implements Observer, DisplayEmenet {
	private float temperature;
	private float humidity;
	private float pressure;
	
	private Subject weatherData;
	
	/**
	 * 
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		//weatherData.registerObserver(this);
	}
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humidity");
		System.out.println("Heat index is "+HeatIndexDisplay.computeHeatIndex(temperature,humidity));
	}

	public void removeRegister(){
		weatherData.removeObserver(this);
	}
}

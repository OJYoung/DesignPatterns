package com.yngzy.observer.javaUtilObserver;

import java.util.Observable;
import java.util.Observer;

import com.yngzy.observer.HeatIndexDisplay;
import com.yngzy.observer.interfaces.DisplayEmenet;

/**
 * @Title:CurrentConditionsDisplay.java
 *
 * @author Young
 *
 *	@date 2016-2-17 下午12:10:55
 *
 * @Copyright:Copyright(c) 2016
 */
public class CurrentConditionsDisplay implements Observer, DisplayEmenet {
	private float temperature;
	private float humidity;
	private Observable observable;
	/**
	 * 
	 */
	public CurrentConditionsDisplay( Observable observable) {
		this.observable=observable;
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			this.temperature=weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humidity");
		System.out.println("Heat index is "+HeatIndexDisplay.computeHeatIndex(temperature,humidity));
	}

}

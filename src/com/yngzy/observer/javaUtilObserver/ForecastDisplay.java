package com.yngzy.observer.javaUtilObserver;

import java.util.Observable;
import java.util.Observer;

import com.yngzy.observer.interfaces.DisplayEmenet;

/**
 * @Title:ForecastDisplay.java
 *
 * @author Young
 *
 *	@date 2016-2-17 下午12:17:08
 *
 * @Copyright:Copyright(c) 2016
 */
public class ForecastDisplay implements Observer,DisplayEmenet{
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			lastPressure=currentPressure;
			currentPressure=weatherData.getPressure();
			display();
		}
	}

	@Override
	public void display() {
	}

}

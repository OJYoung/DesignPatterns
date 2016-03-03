package com.yngzy.observer.test;

import com.yngzy.observer.javaUtilObserver.CurrentConditionsDisplay;
import com.yngzy.observer.javaUtilObserver.WeatherData;


/**
 * @Title:WeatherStation.java
 *
 * @author Young
 *
 *	@date 2016-2-17 上午11:40:03
 *
 * @Copyright:Copyright(c) 2016
 */
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		//注册到主题中
		weatherData.addObserver(currentDisplay);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
	}
}

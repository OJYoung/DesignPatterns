package com.yngzy.observer.javaUtilObserver;

import java.util.Observable;

/**
 * @Title:WeatherData.java
 *
 * @author Young
 *
 *	@date 2016-2-17 下午12:07:41
 *
 * @Copyright:Copyright(c) 2016
 */
public class WeatherData extends Observable{

	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public void measurementsChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	
}

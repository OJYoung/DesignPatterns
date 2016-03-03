package com.yngzy.observer;

import java.util.ArrayList;
import java.util.List;

import com.yngzy.observer.interfaces.Observer;
import com.yngzy.observer.interfaces.Subject;

/**
 * @Title:WeatherData.java
 *
 * @author Young
 *
 *	@date 2016-2-17 上午11:20:18
 *
 * @Copyright:Copyright(c) 2016
 */
public class WeatherData implements Subject {
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	private List<Observer> observsers;
	
	/**
	 * 
	 */
	public WeatherData() {
		observsers = new ArrayList<Observer>();
	}
	@Override
	public void nodifyObservers() {
		for(Observer o:observsers){
			o.update(temperature, humidity, pressure);
		}
	}

	@Override
	public void registerObserver(Observer o) {
		observsers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observsers.indexOf(o);
		if(i>=0){
			observsers.remove(i);
		}
	}

	public void measurementsChanged(){
		nodifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}

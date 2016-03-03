package com.yngzy.command.obj;

/**
 * @author Young
 *
 * @date 2016年2月28日下午4:32:56
 *
 * @Title Stereo.java
 */
public class Stereo {

	public void on(){
		System.out.println("Stereo is on");
	}

	
	public void off(){
		System.out.println("Stereo is off");
	}
	
	public void setCd(){
		System.out.println("set cd to stereo");
	}
	
	public void setDvd(){
		System.out.println("set dvd to stereo");
	}
	
	public void setRadio(){
		System.out.println(" set radio to stereo");
	}
	
	public void setVolume(int volume){
		System.out.println("set volume to "+volume);
	}
}

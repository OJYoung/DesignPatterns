package com.yngzy.command.test;

import com.yngzy.command.GarageDoorOpenCommand;
import com.yngzy.command.LightOffCommand;
import com.yngzy.command.LightOnCommand;
import com.yngzy.command.SimpleRemoteControl;
import com.yngzy.command.obj.GarageDoor;
import com.yngzy.command.obj.Light;

/**
 * @author Young
 *
 * @date 2016年2月28日下午4:06:09
 *
 * @Title RemoteContralTest.java
 */
public class SimpleRemoteContralTest {

	/**
	 * Title:@param args
	 */
	public static void main(String[] args) {
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light();
		remoteControl.setCommand(new LightOnCommand(light));
		remoteControl.buttonWasPressed();
		
		remoteControl.setCommand(new LightOffCommand(light));
		remoteControl.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor();
		remoteControl.setCommand(new GarageDoorOpenCommand(garageDoor));
		remoteControl.buttonWasPressed();
		 
		
	}

}

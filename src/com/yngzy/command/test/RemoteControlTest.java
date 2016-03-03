package com.yngzy.command.test;

import com.yngzy.command.GarageDoorOffCommand;
import com.yngzy.command.GarageDoorOpenCommand;
import com.yngzy.command.LightOffCommand;
import com.yngzy.command.LightOnCommand;
import com.yngzy.command.RemoteControl;
import com.yngzy.command.StereoOffCommand;
import com.yngzy.command.StereoOnWithCDCommand;
import com.yngzy.command.obj.GarageDoor;
import com.yngzy.command.obj.Light;
import com.yngzy.command.obj.Stereo;

/**
 * @author Young
 *
 * @date 2016年2月28日下午4:39:41
 *
 * @Title RemoteControlTest.java
 */
public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		remoteControl.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
		
		GarageDoor garageDoor = new GarageDoor();
		remoteControl.setCommand(1, new GarageDoorOpenCommand(garageDoor), new GarageDoorOffCommand(garageDoor));
		
		Stereo stereo = new Stereo();
		remoteControl.setCommand(2, new StereoOnWithCDCommand(stereo), new StereoOffCommand(stereo));
		System.out.println("-------------------");
		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		System.out.println("-------------------");
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		System.out.println("-------------------");
		remoteControl.onButtonWasPressed(3);
		remoteControl.offButtonWasPressed(3);
		System.out.println("-------------------");
		remoteControl.onButtonWasPressed(2);
		remoteControl.offButtonWasPressed(2);
		System.out.println("-------------------");
		remoteControl.undo();
		remoteControl.undo();
		
	}
	
	
}

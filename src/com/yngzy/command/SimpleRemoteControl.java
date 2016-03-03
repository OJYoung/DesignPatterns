package com.yngzy.command;

import com.yngzy.command.interfaces.Command;

/**
 * @author Young
 *
 * @date 2016年2月28日下午4:03:06
 *
 * @Title SimpleRemoteCOntrol.java
 */
public class SimpleRemoteControl {
	public Command slot;
	
	public void setCommand(Command command){
		this.slot=command;
	}
	
	public void buttonWasPressed(){
		slot.execute();
	}
}

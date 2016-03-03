package com.yngzy.command;

import com.yngzy.command.interfaces.Command;
import com.yngzy.command.obj.GarageDoor;

/**
 * @author Young
 *
 * @date 2016年2月28日下午4:42:14
 *
 * @Title GarageDoorOffCommand.java
 */
public class GarageDoorOffCommand implements Command {

	public GarageDoor garageDoor;

	public GarageDoorOffCommand( GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		garageDoor.stop();
	}
	/* 
	 * @see com.yngzy.command.interfaces.Command#undo()
	 */
	@Override
	public void undo() {
		garageDoor.up();
	}

}

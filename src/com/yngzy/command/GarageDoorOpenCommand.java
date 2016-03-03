package com.yngzy.command;

import com.yngzy.command.interfaces.Command;
import com.yngzy.command.obj.GarageDoor;

/**
 * @author Young
 *
 * @date 2016年2月28日下午4:10:22
 *
 * @Title GarageDoorOpenCommand.java
 */
public class GarageDoorOpenCommand implements Command {

	public GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}

	/* 
	 * @see com.yngzy.command.interfaces.Command#undo()
	 */
	@Override
	public void undo() {
		garageDoor.stop();
	}

}

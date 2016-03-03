package com.yngzy.command;

import com.yngzy.command.interfaces.Command;
import com.yngzy.command.obj.Light;

/**
 * @author Young
 *
 * @date 2016年2月28日下午4:02:04
 *
 * @Title LightOffCommand.java
 */
public class LightOffCommand implements Command {

private Light light;
	
	public LightOffCommand(Light light) {
		this.light=light;
	}

	/* 
	 * @see com.yngzy.command.interfaces.Command#execute()
	 */
	@Override
	public void execute() {
		light.off();
	}

	/* 
	 * @see com.yngzy.command.interfaces.Command#undo()
	 */
	@Override
	public void undo() {
		light.on();
	}

}

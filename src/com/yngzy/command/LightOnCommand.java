package com.yngzy.command;

import com.yngzy.command.interfaces.Command;
import com.yngzy.command.obj.Light;

/**
 * @author Young
 *
 * @date 2016年2月28日下午3:55:33
 *
 * @Title 实现一个点灯打开命令
 */
public class LightOnCommand implements Command {

	private Light light;
	
	public LightOnCommand(Light light) {
		this.light=light;
	}

	/* 
	 * @see com.yngzy.command.interfaces.Command#execute()
	 */
	@Override
	public void execute() {
		light.on();
	}

	/* 
	 * @see com.yngzy.command.interfaces.Command#undo()
	 */
	@Override
	public void undo() {
		light.off();
	}

}

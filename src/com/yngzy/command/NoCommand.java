package com.yngzy.command;

import com.yngzy.command.interfaces.Command;

/**
 * @author Young
 *
 * @date 2016年2月28日下午4:20:09
 *
 * @Title NoCommand.java
 */
public class NoCommand implements Command {

	/* 
	 * @see com.yngzy.command.interfaces.Command#execute()
	 */
	@Override
	public void execute() {
		System.out.println("There is no command");
	}

	/* 
	 * @see com.yngzy.command.interfaces.Command#undo()
	 */
	@Override
	public void undo() {
		System.out.println("There is no command undo");
	}

}

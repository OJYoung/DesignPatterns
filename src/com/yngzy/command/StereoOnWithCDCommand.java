package com.yngzy.command;

import com.yngzy.command.interfaces.Command;
import com.yngzy.command.obj.Stereo;

/**
 * @author Young
 *
 * @date 2016年2月28日下午4:36:14
 *
 * @Title StereoOnWithCDCommand.java
 */
public class StereoOnWithCDCommand implements Command {
	private Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
		
	}

	/* 
	 * @see com.yngzy.command.interfaces.Command#undo()
	 */
	@Override
	public void undo() {
		stereo.off();
	}

}

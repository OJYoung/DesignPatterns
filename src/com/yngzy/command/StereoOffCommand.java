package com.yngzy.command;

import com.yngzy.command.interfaces.Command;
import com.yngzy.command.obj.Stereo;

/**
 * @author Young
 *
 * @date 2016年2月28日下午4:44:30
 *
 * @Title StereoOffCommand.java
 */
public class StereoOffCommand implements Command {

	private Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	@Override
	public void execute() {
		stereo.off();
	}
	/* 
	 * @see com.yngzy.command.interfaces.Command#undo()
	 */
	@Override
	public void undo() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

}

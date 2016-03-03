package com.yngzy.command.interfaces;

/**
 * @author Young
 *
 * @date 2016年2月28日下午3:53:42
 *
 * @Title 实现一个命令接口，所有的命令对象都实现这个接口
 */
public interface Command {
	
	public void execute();
	
	public void undo();
	
	
}

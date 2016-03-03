package com.yngzy.command;

import java.util.Stack;

import com.yngzy.command.interfaces.Command;

/**
 * @author Young
 *
 * @date 2016年2月28日下午4:18:04
 *
 * @Title RemoteControl.java
 */
public class RemoteControl {
	/**
	 * 使用数组初始化length可以一眼就能看出最多有多少个命令能被执行
	 */
	
	private Command[] onCommands;
	
	private Command[] offCommands;
	
	private Stack<Command> commandStack;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		//初始化为默认命令，不执行任何动作。以保证每个按钮都有命令对象
		for(int i=0;i<7;i++){
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
		}
		
		commandStack = new Stack<Command>();
	}
	
	public void setCommand(int slot,Command onCommmand,Command offCommand){
		this.onCommands[slot]=onCommmand;
		this.offCommands[slot]=offCommand;
	}
	
	
	public void onButtonWasPressed(int slot){
		this.onCommands[slot].execute();
		commandStack.push(onCommands[slot]);
	}
	
	public void offButtonWasPressed(int slot){
		this.offCommands[slot].execute();
		commandStack.push(offCommands[slot]);
	}
	
	
	public void undo(){
		commandStack.pop().undo();;
	}
	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer strintBuffer = new StringBuffer();
		strintBuffer.append("\n-------------Remote Control------------\n");
		for(int i=0;i<onCommands.length;i++){
			strintBuffer.append("[slot"+i+"]"+onCommands[i].getClass().getName()
					+"   "+offCommands[i].getClass().getName()+" \n");
		}
		
		return strintBuffer.toString();
	}
}

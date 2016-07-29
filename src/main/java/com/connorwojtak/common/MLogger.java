package com.connorwojtak.common;

import java.util.logging.Logger;

public class MLogger extends Logger{
	
	public static boolean loggerEnabled = false;
	
	protected MLogger(String arg0, String arg1) {
		super(arg0, arg1);
		loggerEnabled = true;
	}

	public void error(String msg){
		System.out.println("{{{{ERROR}}}} " + msg);
	}
	
	@Override
	public void severe(String msg){
		System.out.println("{{{SEVERE}}} " + msg);
	}
	
	@Override
	public void warning(String msg){
		System.out.println("{{WARNING}} " + msg);
	}
	
	public void info(String msg){
		System.out.println("{INFO} " + msg);
	}
}

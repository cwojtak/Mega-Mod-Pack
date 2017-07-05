package com.connorwojtak.init;

import java.util.logging.Logger;

public class MLogger extends Logger{
	
	public static boolean loggerEnabled = false;
	
	public MLogger(String arg0, String arg1) {
		super(arg0, arg1);
		loggerEnabled = true;
	}

	public void error(String msg){
		System.out.println("OG:{ERROR} " + msg);
	}
	
	@Override
	public void severe(String msg){
		System.out.println("OG:{SEVERE} " + msg);
	}
	
	@Override
	public void warning(String msg){
		System.out.println("OG:{WARNING} " + msg);
	}
	
	@Override
	public void info(String msg){
		System.out.println("OG:{INFO} " + msg);
	}
}

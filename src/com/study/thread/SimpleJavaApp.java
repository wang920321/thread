package com.study.thread;

import java.util.Date;

public class SimpleJavaApp {
	
	public static void main(String[] args) throws InterruptedException {
		while(true){
			System.out.println(new Date());
			Thread.sleep(1000);
		}
	}
}

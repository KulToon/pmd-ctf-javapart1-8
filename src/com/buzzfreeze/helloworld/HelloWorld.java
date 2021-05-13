package com.buzzfreeze.helloworld;

public class HelloWorld {
	public static void main(String [] args) {
		
		System.out.println(IsReturn());
		noReturn();
	}
	
	public static void noReturn() {
		System.out.print("No Return");
	}
	public static int IsReturn() {
		return 20;
	}
	
}

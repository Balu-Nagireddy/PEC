package com.training.poly;

public class ExampleOnMethodOverload3 {
	
	public int addition(int a,int b) {
		return a+b;
	}
	
	public int addition(int a,int b,int c) {
		return a+b+c;
	}
	
	public static void m1() {
		System.out.println("we are in static method of m1 zero-argments");
	}
	
	public static String m1(String s) {
		return "hi "+s;
	} 
	
	public static void main() {
		System.out.println("we are in main method of zero-arguments");
	}

	/*
	 * public static void main(String args[]) {
	 * System.out.println("we are in main method of String-arguments"); }
	 */
	
	
}

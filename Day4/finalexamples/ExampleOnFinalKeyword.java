package com.training.finalexamples;

public class ExampleOnFinalKeyword {

	final double pi=3.142;
	static final String companyName="CG";
	 final double maxSal;
	 static final String addrs;
	 
	 //instane block or anyoymus block
	 {
		 this.maxSal=50000;
		 System.out.println("instance block : "+this.maxSal);
	 }
	 
	 //static block
	 static {
		 System.out.println("we are in static block");
		  addrs="CHE"; //initiailization
		 System.out.println("static final varaible : "+ExampleOnFinalKeyword.addrs);
	 }
	 
	public ExampleOnFinalKeyword() {
		System.out.println("we are in defaultconstructor");
	}

	public String sayHello() {
		return "working on final methods";
	}

	public final int addition(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) { ExampleOnFinalKeyword eof = new
			ExampleOnFinalKeyword(); System.out.println(eof.pi); //eof.pi=323232.2;
			/*
			 * System.out.println(ExampleOnFinalKeyword.companyName);
			 * System.out.println("Sum is : "+eof.addition(10,40));
			 */

	}

}

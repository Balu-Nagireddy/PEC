package com.training.poly;

public class ExampleOnMethodOverrload {

	public void addition(int a,int b) {  //addition(int,int)
		int c=a+b;
		System.out.println("Sum of two numbers is : "+c);	
	}
	                                  //addition(int,int,int)
	public int addition(int a,int b ,int c) { //difference in no of parameter
		return a+b+c;      
	}
	                                  //addition(double,double)
	public double addition(double a,double b) {//difference in data type
		return a+b;
	}
	
	public static void main(String[] args) {
		
		ExampleOnMethodOverrload mov = new ExampleOnMethodOverrload();
		mov.addition(10,20);//addition(int,int)
		
		
		double res=mov.addition(10.0,30.0);//addition(double,double)
		System.out.println("Sum of double type two numbers is : "+res);
		
	}
	
	
}

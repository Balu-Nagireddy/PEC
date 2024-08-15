package com.training.poly;

public class ExampleOnAutomaticTypePromotion {

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
		System.out.println("addition method of type double");
		return a+b;
	}
	
	public float addition(float a,float b) {//difference in data type
		System.out.println("addition method of type float");
		return a+b;
	}
	
	public void m1(int x) {
		System.out.println("int type m1 is : "+x);
	}
	/*
	 * public void m1(char x) { System.out.println("char type m1 is : "+x); }
	 */
	public static void main(String[] args) {
		ExampleOnAutomaticTypePromotion eoap = new ExampleOnAutomaticTypePromotion();
		System.out.println(eoap.addition(10.0f,40.0F));
		
	     eoap.m1('m');//m1(char)
		
		
		
		
	}
	
	
	
	
	
	
}

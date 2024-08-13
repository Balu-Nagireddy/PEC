package com.training;

public class ExampleOnVariables {
	
	//instance variables
	int empId=101;
	String empName="smith";
	double empSal=4000;
	
	static String companyCode="EME";
	
	//instance method
	public void display() {
		int bonus=3000; //localvariable 
	    System.out.println("local variable value is : "+bonus);
	}
	//static method
	public static void m1() {
		System.out.println("we are in method One");
	}
	
	public static void main(String[] args) {
		ExampleOnVariables  eov = new ExampleOnVariables();
		System.out.println("EMployee Details are : ");
		System.out.println(eov.empId+" "+eov.empName+" "+eov.empSal);
		 System.out.println("calling static variable  companyCode");
		 System.out.println(eov.companyCode);//not recommended
		 System.out.println("calling static variable in static way (classname)");
		 System.out.println(ExampleOnVariables.companyCode);
		 
		 //calling instane method
		 eov.display();
		 
		 //calling static method using static way(classname)
		 ExampleOnVariables.m1();
		
	}
	
	

}

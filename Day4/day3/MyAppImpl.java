package com.training.day3;

public class MyAppImpl implements MyApp{

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("we are in method one");
	}

	public static void main(String[] args) {
		//first way
		MyAppImpl  myappObj = new MyAppImpl();
		int sum =myappObj.addition(30, 50);
		System.out.println("sum of two numbers is : "+sum);
		myappObj.m1();
		
		//second way or recommended way
		//Interface referenName= new holding its implementation class object
		System.out.println("---Second Way---");
		 
		MyApp mobj1 =new MyAppImpl(); //polymorphism
		int res=mobj1.addition(40, 50);
		System.out.println("sum of two numbers : "+res);
		mobj1.m1();
		
		System.out.println("Calling static final varaibles from Interface");
		System.out.println(MyApp.companyName);
		System.out.println(MyApp.pi);
		System.out.println(MyApp.empId);
		
		
	}
}

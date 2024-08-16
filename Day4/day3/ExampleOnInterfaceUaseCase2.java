package com.training.day3;

public class ExampleOnInterfaceUaseCase2 implements MyInt1,MyInt2{

	@Override
	public int addition(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("we are in method m2");
	}

	@Override
	public String sayHello(String m) {
		// TODO Auto-generated method stub
		return "welcome  "+m;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("we are in method m1");
	}

	public static void main(String[] args) {
		ExampleOnInterfaceUaseCase2  eou2 = new ExampleOnInterfaceUaseCase2();
		eou2.m1();
		eou2.m2();
		System.out.println("sum is  : "+eou2.addition(10,50,60));
		System.out.println(eou2.sayHello("martin"));
		
	}
	
	
	
}

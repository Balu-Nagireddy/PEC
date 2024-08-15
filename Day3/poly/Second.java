package com.training.poly;

public class Second extends First{
	
	public void m2() {
		System.out.println("we are in m2 method of Second-child class");
	}
	
	@Override
	public String sayHello(String s) {
		return "welcome "+s;
	}
	
	public static void main(String[] args) {
		Second sobj = new Second();
		
		sobj.m1();//parent
		
		sobj.m2();//child
		
		String res=sobj.sayHello("Ravi");
		System.out.println(res);
		
	}
	

}

package com.training.poly;

public class Child extends Parent{
	
	String name="second";
	
	public void m2() {
		System.out.println("we are in method of Child class");
	}
	
	@Override
	public String sayHello(String s) {
		return "welcome "+s;
	}
	
	public void display() {
		System.out.println("we are in display method of child class");
		System.out.println(super.name);//parent class instance variable
		String p1 =super.sayHello("Smith"); //parent class instance method
		System.out.println("messgae from parent class : "+p1);
	}
	
	public static void main(String[] args) {
		Child cobj = new Child();
		cobj.m2();//child
		cobj.m1(); //parent
		String res =cobj.sayHello("ravi");
		System.out.println(res);
		
		System.out.println("variable name is : "+cobj.name);
		//System.out.println(super.name);not valid
		
		cobj.display();
		
	}

}

package com.training.java8;

public class MyTestImpl  {
	public String m1(String m) {//instance method
		return "hello "+m;
	}	
	public static String m2(String m) { //static method
		return "hi "+m;
	}
	public static void main(String[] args) {
		MyTestImpl mytobj = new MyTestImpl();//creating object 
		
		MyTest  myobj =(x)->"welcome "+x; //normal implementation for SAM using lambda expression
		//:: -> method reference operator
		MyTest myt1 = mytobj::m1; //method reference to instance method using objectReference
			
		MyTest myt2 = MyTestImpl::m2; //method reference to static method using className
		
		System.out.println(myobj.sayHello("ravi"));
		System.out.println(myt1.sayHello("smith"));
		System.out.println(myt2.sayHello("martin"));	
	}

}

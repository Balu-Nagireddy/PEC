package com.training.day3;

public class ExampleOnInterfaceUseCase3 extends MyInt3 implements MyInt4{

	@Override
	public String sayHello(String m) {
		// TODO Auto-generated method stub
		return "hello "+m;
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("we are in method two");
	}
	
	public static void main(String[] args) {
		ExampleOnInterfaceUseCase3 eou3 = new ExampleOnInterfaceUseCase3();
		//calling parent class method
		System.out.println("sum is : "+eou3.addition(10,40,120));
		eou3.m1();
		
		//calling implementation methods
		System.out.println(eou3.sayHello("pawan"));
		eou3.m2();
		
	}

}

package com.training.day3;

public class ExampleOnInterfaceUseCase1 implements I2{

	@Override
	public String sayHello(String m) {
		// TODO Auto-generated method stub
		return "welcome "+m;
	}

	@Override
	public int addition(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("we are in display method");
	}
	
	public static void main(String[] args) {
		ExampleOnInterfaceUseCase1 eou1 = new ExampleOnInterfaceUseCase1();
		eou1.display();
		int sum = eou1.addition(10,60,30);
		System.out.println("sum of two numbers : "+sum);
		System.out.println(eou1.sayHello("Ravi"));
	     System.out.println("---------------------------");	
		
		//2ndway of creation
		I2 iobj = new ExampleOnInterfaceUseCase1(); //polymorphism
		System.out.println("sum is : "+iobj.addition(10,30, 10));
		System.out.println(iobj.sayHello("smith"));
		iobj.display();
		
	}
	

}

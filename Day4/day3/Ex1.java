package com.training.day3;

public class Ex1 extends ExampleOnUseCase5{
	
	public void m3() {
		System.out.println("we are in method 3");
	}
	
	public static void main(String[] args) {
		Ex1 e1 = new Ex1();
		e1.m3();
		System.out.println(e1.sayHello());
		e1.display();
		
	}

}

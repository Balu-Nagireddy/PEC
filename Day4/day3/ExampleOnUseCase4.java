package com.training.day3;

public class ExampleOnUseCase4 extends MyIntImpl{////extending from MyIntImpl abstract class

	@Override
	public int addition(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	} 


	public void m2() {
		System.out.println("we are in method two of ExampleOnUseCase4");
	}

	public static void main(String[] args) {
         ExampleOnUseCase4 eou4 = new ExampleOnUseCase4();
         eou4.m2();
         eou4.m1();
         System.out.println(eou4.sayHello("sai"));
         int res =eou4.addition(10,30,40);
         System.out.println("sum is  : "+res);
         
	}
}

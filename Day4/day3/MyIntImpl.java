package com.training.day3;

public abstract class MyIntImpl implements MyInt{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("we are in methodOne");
	}

	@Override
	public String sayHello(String m) {
		// TODO Auto-generated method stub
		return "Welcome to abstract : "+m;
	}


}

package com.training.finalexamples;
//final class cannot be a subclass
public class TestOnFinalMethod extends ExampleOnFinalKeyword{
	
	@Override
	public String sayHello() {
		return "we are in child class";
	}
	/*
	 * @Override public final int addition(int a,int b) { return a+b; }
	 */
	
	//final method cannot be overriden 
	
}

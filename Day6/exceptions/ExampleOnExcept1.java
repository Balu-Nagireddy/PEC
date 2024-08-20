package com.training.exceptions;

public class ExampleOnExcept1 {
	public static void main(String[] args) {
		
		System.out.println("statement -1");
		try {
		int z = 10/0;
		System.out.println("operation value is : "+z);
		}catch(ArithmeticException ae) {
			//ae.printStackTrace();
			//System.out.println(ae.getMessage());
			System.err.println("Denominator cannot be zero");
		}
		
		
		System.out.println("end of the program");
		
		
	}

}

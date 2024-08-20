package com.training.exceptions;

import java.util.Scanner;

public class ExampleCheckingAgeUsingPropogation {
	
	public void validAge(int ag) throws ValidAgeException {//called  method 
		if(ag<18) {
			throw new ValidAgeException("Age should be greater or equals to 18 to cast a vote");
		}else {
			System.out.println("Valid Age");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age =sc.nextInt();
		 
		ExampleCheckingAgeUsingPropogation eoep = new ExampleCheckingAgeUsingPropogation();
		try {
		eoep.validAge(age);//it will propagate(throws the exception) here
		}catch (ValidAgeException e) {
			System.err.println(e.getMessage());//calling method
		}finally {
			System.out.println("we are in finally block is ment for closing all resources");
			sc.close();
		}
		
		
		
		
		
		
		
		
		
	}

}

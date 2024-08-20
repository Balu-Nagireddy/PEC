package com.training.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleOnExcept4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("statement -1");
		try {
	    int a =sc.nextInt();
	    int b =sc.nextInt();
		int z = a/b;
		System.out.println("operation value is : "+z);
		}catch(ArithmeticException ae) {//order child exception followed by parent excetpion
			//ae.printStackTrace();
			//System.out.println(ae.getMessage());
			System.err.println("Denominator cannot be zero");
		}catch (InputMismatchException e) {//parent exception
			System.err.println("Input must be int type");
		}
		
		
		System.out.println("end of the program");
		
		
	}

}

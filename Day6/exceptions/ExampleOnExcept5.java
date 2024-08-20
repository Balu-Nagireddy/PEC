package com.training.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleOnExcept5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("statement -1");
		try {
			int a =sc.nextInt();
			int b =sc.nextInt();
			int z = a/b;
			System.out.println("operation value is : "+z);
			//order child exceptions handled by parent exception
			//in single catch block you can handle multiple exception separated by '|' operator
		}catch(ArithmeticException |InputMismatchException ae) {
			ae.printStackTrace();
		}


		System.out.println("end of the program");


	}

}

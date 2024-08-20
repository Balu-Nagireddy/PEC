package com.training.exceptions;

import java.util.Scanner;

public class ExampleOnExcept2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		int a[] = new int[5];
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("Display");
		for(int i=0;i<=a.length;i++) {
			System.out.println(a[i]);
		}
	}catch(ArrayIndexOutOfBoundsException ae) {
		ae.printStackTrace();
	}
		System.out.println("end of the program");
	}
}

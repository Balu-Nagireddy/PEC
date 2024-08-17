package com.training.arrays;

import java.util.Scanner;

public class ExampleOnArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//declare an array to store five elements

		int a[] = new int[5];

		System.out.println("Adding elements into array a");
		for(int i=0;i<a.length;i++) {
		  System.out.println("Enter the element at index position ["+i+"]");
			a[i]=sc.nextInt();
		}

		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

		System.out.println("Displaying the elements using enhanced forLoop");
		for(int b: a) {
			System.out.println(b);
		}


	}

}

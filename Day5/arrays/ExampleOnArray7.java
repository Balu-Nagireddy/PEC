package com.training.arrays;

import java.util.Scanner;

public class ExampleOnArray7 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sz = s.nextInt();
		int a[] =new int[sz];
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		for(int i=a.length-1; i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
		
	}

}

package com.training;

import java.util.Scanner;

public class Lab1 {
	
	public int calcuateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				//sum=sum+i;
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);	
	  System.out.println("Enter the first n natural number");
	  int j=sc.nextInt();
	  
	  Lab1 l1 = new Lab1();//createing object 
	  int res=l1.calcuateSum(j); //calling a method
	  System.out.println("sum of first n naturla number is : "+res);
	
	}

}

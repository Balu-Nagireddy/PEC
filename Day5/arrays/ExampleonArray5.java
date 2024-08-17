package com.training.arrays;

public class ExampleonArray5 {
	
	public int calcuateSum(int a[]) {
		int sum=0;
		for(int b:a) {
			sum+=b; //sum=sum+b;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		ExampleonArray5 eoa5 = new ExampleonArray5();
		int a[]= {30,10,20,50};
		
		int res =eoa5.calcuateSum(a);
		System.out.println("Sum of elements from the array : "+res);
		
		
	}

}

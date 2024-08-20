package com.training.exceptions;

public class ExampleOnExpept3 {

	public static void main(String[] args) {
		
		String s1 ="helloworld";
		System.out.println(s1.length());
		try {
		String s2=null;
		System.out.println("opertation : "+s2.length());
		}catch (NullPointerException e) {
			System.err.println("String is null we cannot perform any opetation");
		}
		System.out.println(s1.toUpperCase());
		
	}
	
}

package com.training.exceptions;

import java.util.Scanner;

public class CheckingAge {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age =sc.nextInt();
		try {
		if(age<18) {//throwing user defined Exception  using throw keyword
			throw new ValidAgeException("Age should be greater or equal to 18 to cast a vote");
		}else {
			System.out.println("Valid Age ");
		}
		
		}catch (ValidAgeException vg) {
			System.err.println(vg.getMessage());
		}
		
		
		
		
		
		
	}

}

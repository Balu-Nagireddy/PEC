package com.training.accessmodifier;

public class TestOnAccessModifiers {
	public static void main(String[] args) {
		
		ExampleOnAccessModifier eoam = new ExampleOnAccessModifier();
		
		System.out.println(eoam.compNameName);//public
		System.out.println(eoam.empSal);//protected
		//System.out.println(eoam.empName);//private
		System.out.println(eoam.empId);//default
		
		eoam.m1();//public
		eoam.m2();//protected
		//eoam.m3();//private
		eoam.m4();//default
		
		
	}

}

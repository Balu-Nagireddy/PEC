package com.training.accesssmodifier2;

import com.training.accessmodifier.ExampleOnAccessModifier;

public class TestOnChild extends ExampleOnAccessModifier{
	
	public static void main(String[] args) {
		
		TestOnChild toc = new TestOnChild();
		
		System.out.println(toc.compNameName);//public
		System.out.println(toc.empSal);//protected
		//System.out.println(toc.empName);//private
		//System.out.println(toc.empId);//default
		
		toc.m1();//public
		toc.m2();//protected
		//toc.m3();//private
		//toc.m4();//default
		
		
		
	}

}

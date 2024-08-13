package com.training;

public class ExampleOnIfesleIf {
	public static void main(String[] args) {

		int x=20,y=10,z=5;
		
		if(x > y && x>z) {
			System.out.println("x is greater than y,z");
		}else if(y> z && y>x) {
			System.out.println("Y is greater than x ,z");
		}else {
			System.out.println("Z is greater than x,y");
		}
		

	}
}

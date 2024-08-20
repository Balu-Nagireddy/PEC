package com.training.exceptions;

import java.beans.Statement;

public class ExampleOnExpept6 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("statement -1");
		
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		//2nd way using throws
		Thread.sleep(1000);
		
		System.out.println("end of the program");
	}
	
}

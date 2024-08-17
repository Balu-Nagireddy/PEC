package com.training.arrays;

public class ExampleOnArray3 {
	public static void main(String[] args) {

		//two dimensional array
	
		 int a[][]= {{10,30,50},{40,60,30}};  /// 10 30 50
                                               //  40 60 30

     
		 System.out.println("Displaying the elements using Two dimensional array");
		 for(int i=0;i<2;i++) {
			 for(int j=0;j<3;j++) {
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println(" ");
		 }
		 
		 

	}
}

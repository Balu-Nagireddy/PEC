package com.training.set;

import java.util.HashSet;

public class ExampleOnSet2 {
	
	public static void main(String[] args) {
		HashSet<Product>  hs = new HashSet<Product>();
		Product p = new Product(1001,"mouse",500);
		Product p1 = new Product(2931,"mobile",10000);
		Product p2 = new Product(3121,"laptop",50000);
		Product p3 = new Product(1001,"mouse",500);
		Product p4 = new Product(2121,"tv",500);
		
		 hs.add(p);
		 hs.add(p1);
		 hs.add(p2);
		 hs.add(p4);
		 hs.add(p3);
		 
		 System.out.println("Displaying the object from hashset using enhanced for loop");
		 for(Product pobj :hs) {
			 System.out.println(pobj.getProductId()+" "+pobj.getProductName()+" "+pobj.getPrice());
		 }

		 System.out.println("p address is : "+p.hashCode());
		 System.out.println("p3 address is : "+p3.hashCode());
		
	}

}

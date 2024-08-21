package com.training.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOnArrayList4 {
	
	public static void main(String[] args) {
		
		ArrayList<Product> al = new ArrayList<Product>();
		
		Product p = new Product();
		p.setProductId(121);
		p.setProductName("mouse");
		p.setPrice(500);
		
		Product p1 = new Product(1221,"monitor",5000);
		
		al.add(new Product(131,"laptop",50000));
		al.add(p);
		al.add(p1);
		
		System.out.println("No of product stored in al : "+al.size());
		System.out.println("Displaying the list : ");
		System.out.println(al);
		
		System.out.println("Displaying the product details using iterator");
	Iterator<Product>iobj =	al.iterator();
	while(iobj.hasNext()) {
		Product pobj = iobj.next();
		System.out.println(pobj.getProductId()+" "+pobj.getProductName()+" "+pobj.getPrice());
	}
	System.out.println("Displaying the product details using enhanced forloop");
	for(Product p2obj :al) {
		System.out.println(p2obj.getProductId()+" "+p2obj.getProductName()+" "+p2obj.getPrice());
	}
	
	System.out.println("Displaying the product details using java8 forEach loop");
	al.forEach(p3obj -> {System.out.println(p3obj.getProductId()+" "+p3obj.getProductName()+" "+p3obj.getPrice());});
	
	
	
	
	
		
		
	}

}

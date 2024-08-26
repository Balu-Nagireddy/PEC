package com.training.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestOnJava8StreamApiManipulationOnCollection {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(30);
		al.add(10);
		al.add(50);
		al.add(10);
		al.add(25);
		al.add(20);
		
		System.out.println("no of elements is : "+al.size());
		
		System.out.println("Java8 forEach method");
		al.forEach(e->System.out.println(e));
		
		System.out.println("Java8 forEach method using methodReference");
		al.forEach(System.out::println);
		
		//convert collection object into stream object using stream()
		Long ct =al.stream().filter(i -> i%2==0).count();
		System.out.println("Even numbers count: "+ct);
		
		//for each object in al add +3 and convert into new list using map
		List<Integer> lt1 =al.stream().map(i -> i+3).collect(Collectors.toList());
		System.out.println("Displayin the map() output");
		lt1.forEach(System.out::println);
		
		System.out.println("Natural sorting order-ascending order");
		al.stream().sorted().forEach(System.out::println);
		
		System.out.println("Descending order");
		Comparator<Integer> cpt =(i1,i2)->(i1>i2?-1:i1<i2?1:0);  
		al.stream().sorted(cpt).forEach(System.out::println);
		
		Comparator<Integer> cpt1 =(i1,i2)->(i1>i2?1:i1<i2?-1:0);
		System.out.println("max objex its : ");
		int maxValue=al.stream().max(cpt1).get();
		System.out.println("Max value is : "+maxValue);
		
		int minValue=al.stream().min(cpt1).get();
		System.out.println("Minvalue is : "+minValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.training.map;

import java.util.ArrayList;

public class ExampleOnExcerises {

	public static void main(String[] args) {
		
		String s = new String("hello");
		System.out.println(s);
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println("");
		ArrayList<Integer> al = new ArrayList();
		al.add(30);
		al.add(10);
		al.add(40);
		al.add(20);
		System.out.println(al);
		
		Object obj[]=al.toArray();
		for(Object a :obj) {
			System.out.println(a);
		}
		
		int sz = al.size();
		Integer a[] =null;
		
		
		a =al.toArray(new Integer[sz]);
		for(int i:a) {
			System.out.println(i);
		}
		
		
		
	}
}

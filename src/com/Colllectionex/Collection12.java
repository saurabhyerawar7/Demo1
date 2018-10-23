package com.Colllectionex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection12 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(25);
		al.add(20);
		for (int i = 0; i < al.size(); i++) {
			int n = al.get(i);
			System.out.println(n);
		}
		System.out.println("..........................................................");
		for (int x : al) {
			
			System.out.println(x);
		}
		System.out.println("..........................................................");

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			
		Object o = itr.next();
		Integer s = (Integer) o;
	
	
		
		System.out.println(s);
		}
		System.out.println("..........................................................");

	ListIterator<Integer> litr= al.listIterator();
	while(litr.hasNext()) {
		Object o= litr.next();
		Integer d=(Integer)o;
		System.out.println(d);
		
	}
	System.out.println("..........................................................");

	Collections.rotate(al, 0);
	System.out.println("rotedlist>>"+al);
	 
Collections.reverse(al);
System.out.println("reverse"+al);
	}

}

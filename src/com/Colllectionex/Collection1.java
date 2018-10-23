package com.Colllectionex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int count = 0;

		list.add(12);
		list.add(123);
		list.add(52);
		list.add(61);
		System.out.println(list);
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			count++;
			System.out.println(it.next());

		}
		System.out.println(count);
		
		//list  iterater
		System.out.println("***********************************");
		ListIterator<Integer> it1= list.listIterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("********************************[[[[[[[[[[[[[[[");
		
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
			
		}
		
		
		
		
		
	}

}

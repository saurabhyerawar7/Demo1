package com.Colllectionex;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Enumaration {

	public static void main(String[] args) {

		Vector<Integer> list = new Vector<>();
		list.add(11);
		list.add(12);
		list.add(13);
		Enumeration<Integer> enumeration = list.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}

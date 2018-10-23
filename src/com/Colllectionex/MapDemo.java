package com.Colllectionex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(12, "sdss");
		map.put(13, "sdsfhds");
		map.put(14, "sdssdgdfgdgd");
		/*
		 * for(Entry<Integer,String> entry : map.entrySet()) {
		 * System.out.println(entry.getKey()); System.out.println(entry.getValue());
		 * System.out.println("***********************");
		 * 
		 * }
		 */

		Set<Integer> set = map.keySet();
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();

			System.out.println(key + " " + map.get(key));

		}

	}

}

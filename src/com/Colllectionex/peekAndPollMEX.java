package com.Colllectionex;

import java.util.LinkedList;
import java.util.Queue;

public class peekAndPollMEX {

	public static void main(String[] args) {

		Queue<Integer> q= new LinkedList<>();
		
		q.add(12);
		q.add(52);
		q.add(56);
		Integer x=q.peek();
		Integer y=q.poll();
		System.out.println(y);
		System.out.println(x);
		//x=q.remove();
		System.out.println(x);
		System.out.println(q);
	
	}

}

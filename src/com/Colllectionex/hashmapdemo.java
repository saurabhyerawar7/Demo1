package com.Colllectionex;

import java.util.HashMap;
import java.util.Set;

public class hashmapdemo {

	public static void main(String[] args) {
HashMap< Integer,String> hm = new HashMap<>();
hm.put(1,"asa");
hm.put(2,"sss");
hm.put(3,"mmm");
Set<Integer> key=hm.keySet();
for(int ke:key)
{
	System.out.println(ke );
	String val =hm.get(key);

	System.out.println( val);
	
}

	
	}

}

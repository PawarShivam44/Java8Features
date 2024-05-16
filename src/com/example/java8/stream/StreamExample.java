package com.example.java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StreamExample {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("bimal");
		list.add("bikash");
		list.add("piter");
		list.add("prakash");
		list.add("biki");
		
		list.stream().filter(n->n.startsWith("b")).forEach(m->System.out.println(m));

		//		 for(String name: list) {
//			 System.out.println(name);
//		 }
		
//		list.stream().forEach((n)->{System.out.println(n);});
		
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
//		map.forEach((key, value)->{System.out.println(key+":"+value);});
//		map.entrySet().stream().forEach(mapkeyvalue->System.out.println(mapkeyvalue));
		
		
	}
	

	
	
}

package com.example.java8.stream.api.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemoExample {

	
	public static void main(String[] args) {
		Map<String,Integer> map= new HashMap<String,Integer>();
		
		map.put("one", 1);
		map.put("ten", 10);
		map.put("two", 2);
		map.put("nine", 9);
		map.put("eight", 8);
		
//		System.out.println(map.entrySet());
		
//		List<Entry<String,Integer>> entries= new ArrayList<>(map.entrySet());
//		
//		
//	Collections.sort(entries, (o1,o2)->o1.getValue().compareTo(o2.getValue()));
//	
//	System.out.println(entries);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println(".......................");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}
	
}

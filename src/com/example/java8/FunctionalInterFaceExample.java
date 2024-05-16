package com.example.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterFaceExample implements Supplier<String>{

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "We are from spring boot batch";
	}
	
	public static void main(String[] args) {
		Supplier<String> sup= new FunctionalInterFaceExample();
//		System.out.println(sup.get());
	Supplier<String> supplier =()-> "We are from spring boot batch With java8";
//		System.out.println(supplier.get());
		
		List<String> list= Arrays.asList();
		
		System.out.println(list.stream().findAny().orElseGet(supplier));
	}
	
	
	
//	public static void main(String[] args) {
//		List<Integer> list= Arrays.asList(1,2,3,4,5,6);
//		//
////		for(Integer i : list) {
////			System.out.println(i);
////		}
//	System.out.println("........................................");	
//		list.stream().forEach(t->System.out.println(t));
//		
//		list.forEach(null);
//	}

//	@Override
//	public boolean test(Integer t) {
//		if(t%2==0) {
//			return true;
//		}else {
//		return false;
//		}
//	}
	
//	public static void main(String[] args) {
////		Predicate<Integer>  predicate = (t)->t%2==0;
////		System.out.println(predicate.test(9));
////		List<Integer> list= Arrays.asList(1,2,3,4,5,6);
////		
////		list.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
////		System.out.println("...............................");
////		list.stream().filter(t->t%2!=0).forEach(t->System.out.println(t));
//	}

}

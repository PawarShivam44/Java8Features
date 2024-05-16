package com.example.java8.stream.Map_FlatMap;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {
		List<Student> studentList= StudentDataBase.getListStudent();
		
	List<String> email=	studentList.stream().map(s->s.getsEmail()).collect(Collectors.toList());
	System.out.println(email);
		System.out.println("...............................");
	 List<List<String>> mobile= studentList.stream().map(s->s.getsMobile()).collect(Collectors.toList());
	
	 System.out.println(mobile);
	 System.out.println(".....................");
	 
	List<String> mobileno= studentList.stream().flatMap(s->s.getsMobile().stream()).collect(Collectors.toList());
	
	System.out.println(mobileno);
	}
}

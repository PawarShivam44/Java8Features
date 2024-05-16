package com.example.java8.stream.api.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemoExample {
	
public static void main(String[] args) {
	
//	List<Integer> numberList= Arrays.asList(1,5,8,2,7,3,4,9,6);
//	
//	Collections.sort(numberList);
//	Collections.reverse(numberList);
//	System.out.println(numberList);
//	System.out.println("..................................................");
//	numberList.stream().sorted().forEach(n->System.out.println(n));
//	System.out.println("................................................");
//	numberList.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
	
//	List<Employee> empList= DataBase.getEmployeeList();
	
//	Collections.sort(empList,  new Comparator<Employee>() {
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			return (int) (o2.getSalary()-o1.getSalary());
//		}
//	});
//	System.out.println(empList);
	List<Employee> empList= DataBase.getEmployeeList();
	
//	empList.stream().sorted( (o1,  o2)-> (int)(o2.getSalary()-o1.getSalary())).forEach(System.out::println);
//	empList.stream().sorted(new Comparator<Employee>() {
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			return (int) (o2.getSalary()-o1.getSalary());
//		};
//	}).forEach(System.out::println);
	
	
	empList.stream().sorted(Comparator.comparing(emp ->((Employee) emp).getSalary()).reversed()).forEach(System.out::println);
}
	

	 class MyComparater implements Comparator<Employee>{
		
		@Override
		public int compare(Employee o1, Employee o2) {
			
			return (int) (o1.getSalary()-o2.getSalary());
		}
		
	}

	
}

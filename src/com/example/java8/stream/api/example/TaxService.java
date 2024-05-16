package com.example.java8.stream.api.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	
	public static List<Employee> getEmplyeesWithTaxAndWithouTest(String input){
		
		List<Employee> empList= DataBase.getEmployeeList();
//		();
	empList.stream().forEach(System.out::println);
		
		if(input.equalsIgnoreCase("taxable employee")) {
			return empList.stream().filter(Employee->Employee.getSalary()>500000).collect(Collectors.toList());
		}else if(input.equalsIgnoreCase("non taxable employee")) {
			
			 return empList.stream().filter(e->e.getSalary()<=500000).collect(Collectors.toList());
		}
		return null;
	}
	
	
	public static void main(String[] args) {
//		List<Employee> empList= DataBase.getEmployeeList();
//		
//		empList.stream().filter(emp->emp.getSalary()>500000).forEach(e->System.out.println(e));
		System.out.println(getEmplyeesWithTaxAndWithouTest(" "));
	}
}

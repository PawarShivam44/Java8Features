package com.example.java8.stream.api.example;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	
	public static List<Employee> getEmployeeList(){
		List<Employee> empList= new ArrayList<Employee>();
		
		empList.add(new Employee(1, "Prakash", "IT", 600000));
		empList.add(new Employee(2, "Rakesh", "CIVIL", 500000));
		empList.add(new Employee(3, "Vikash", "Defence", 700000));
		empList.add(new Employee(4, "Gourav", "IT", 1000000));
		empList.add(new Employee(5, "Ganesh", " Core", 400000));
		empList.add(new Employee(6, "Sourav", "Social", 300000));
		
		return empList;
	}
}

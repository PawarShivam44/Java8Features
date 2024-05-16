package com.example.optional;

import java.util.Optional;

public class MainClass {

	public static void main(String[] args) throws Exception {
		Employee emp=new Employee(1, "abc", null, "25");
	//empty
	//of
		//ofNullable
//		Optional<Object> opt=  Optional.empty();
//		
//		System.out.println(opt);
	//////////////////////////////////////////////
	
		Optional<String> emailOpt=  Optional.ofNullable(emp.getEmail());
		System.out.println(emailOpt);
		
		
//		Optional<String> emailOpt = Optional.ofNullable(emp.getEmail());
//	if(emailOpt.isPresent()) {
//		System.out.println(emailOpt);
//	}else {
//		System.out.println("no email");
//	}
	
//		System.out.println(emailOpt.orElse("bbb@gmail.com"));
//	System.out.println(emailOpt.orElseThrow(()-> new Exception("email not present")));
	
		
//	if(emp.getEmail()!=null)	{
//		System.out.println("..............");
//		System.out.println(emp.getEmail());
//	}
	
	}
}

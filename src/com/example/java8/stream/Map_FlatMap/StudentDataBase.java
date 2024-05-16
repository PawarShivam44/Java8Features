package com.example.java8.stream.Map_FlatMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDataBase {

	public static List<Student> getListStudent() {

		return Stream
				.of(new Student(1, "Bikash", "bikash12345@gmail.com", Arrays.asList("7685349210", "9876512355")),
						new Student(2, "Prakash", "prakash12345@gmail.com", Arrays.asList("7685340010", "9866512355")),
						new Student(3, "Ganesh", "ganesh12345@gmail.com", Arrays.asList("7685009210", "9878812355")),
						new Student(4, "Ram", "ram12345@gmail.com", Arrays.asList("7685349110", "9876511155")),
						new Student(5, "Krishna", "krishna12345@gmail.com", Arrays.asList("7685889210", "9876517755")))
				.collect(Collectors.toList());
	}

}

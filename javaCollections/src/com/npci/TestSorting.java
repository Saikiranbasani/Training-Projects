package com.npci;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class TestSorting {
	
	public static void main(String[] args) {
		// TreeSet Looks for Comaparable method
		// String,Int, Double ,LocalDate and so on implements Comparable.compareTo(T t)
		
		Set<String> strings=new TreeSet<>((x,y)->y.compareTo(x));
		strings.add("HELLO");
		strings.add("Hello");
		strings.add("Hii");
		strings.add("Test");
		
		System.out.println(strings);
		
		Set<Employee> employees=new TreeSet<>((x,y)-> Double.compare(y.getSalary(),x.getSalary()));
		employees.add(new Employee(666,"Zaheer",80000, LocalDate.parse("1970-10-06")));
		employees.add(new Employee(555,"sachin",90000,LocalDate.parse("1975-12-25")));
		employees.add(new Employee(777,"Yuvraj",85000,LocalDate.parse("1973-11-09")));
		employees.add(new Employee(444,"Dhoni",76000,LocalDate.parse("1974-12-04")));
		
		for(Employee employee:employees) {
			System.out.println(employee);
		}
	}

	

}

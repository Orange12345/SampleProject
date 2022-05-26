package com.local.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[])
	{
		Employee e1=new Employee(12,"Babloo", new Address(23, "Royal ascot"));
		Employee e2=new Employee(1,"pro", new Address(23, "Muse"));
		Employee e3=new Employee(23,"mintu", new Address(23, "warick"));
		
		ArrayList<Employee>emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		System.out.println("Emp Id comparator");
		Collections.sort(emp, new EmpIdComparator());
		System.out.println(emp);
		System.out.println("......................................");
		System.out.println("Emp Name comparator");
		Collections.sort(emp,new NameComparator());
		System.out.println(emp);
		System.out.println("......................................");
		System.out.println("streat name Address comparator");
		Collections.sort(emp,new AdressComparator());
		System.out.println(emp);
	}
}

package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpAssignment ass = new EmpAssignment();
		Employee e1 = new Employee(10, "ABC", 20000);
		Employee e2 = new Employee(20, "ABC", 30000);
		Employee e3 = new Employee(30, "XYZ", 30000);
		Employee e4 = new Employee(40, "XYZ", 70000);
	
		ass.add(e1);
		ass.add(e2);
		ass.add(e3);
		/*
		ass.printemp();
		
	//	ass.remove(e3);
		ass.printemp();
		
		ass.update(e2, e4);
		ass.printemp();*/

		List<Employee> list = new ArrayList<Employee>();
		EmpNameComparator name = new EmpNameComparator();
		EmpSalaryComparator sal = new EmpSalaryComparator();
	//	Collections.sort(list, name);
		Collections.sort(list, sal);
		
		list.add(e1);
		list.add(e4);
		list.add(e3);
		list.add(e2);
		
	/*	ListIterator<Employee> listitr = list.listIterator();
		while(listitr.hasNext())
		{
			System.out.println(listitr.next());
		}
		
		System.out.println("reverse order");
		
		while(listitr.hasPrevious())
		{
			System.out.println(listitr.previous());
		}
		
		*/
		System.out.println(list);
	}

}

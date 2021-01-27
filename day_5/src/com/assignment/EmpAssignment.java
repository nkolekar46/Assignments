package com.assignment;

import java.util.*;


public class EmpAssignment {
	
	List<Employee> emp = new ArrayList<Employee>();
	public void add(Employee data)
	{
		emp.add(data);
	}
	
	public List<Employee> getAll()
	{
		return emp;
	}
		
	
	public void remove(Employee data)
	{
		emp.remove(data);
	}
	
	public void update(Employee old, Employee newemp)
	{
		emp.set(emp.indexOf(old), newemp);
	}
	
	
	public Employee getEmp(int empid)
	{
		Employee data = null;
		for(Employee a : emp)
		{
			if(a.getEmpId() == empid)
				data=a;
		}
		
		return data;
	}
	
	public void printemp() {
		System.out.println(emp);
	}

}

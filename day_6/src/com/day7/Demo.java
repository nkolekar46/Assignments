package com.day7;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1 = new Address(411028, "Pune");
		Address a2 = new Address(400002, "Mumbai");
		
		Employee e =new Employee(11, "BAC", 200, a1);
		Employee e1 =new Employee(12, "eff", 300, a2);
		Employee e2 =new Employee(13, "rdf", 400, a1);
		
		
		e.doSerialize();
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
	
	
		Employee temp = new Employee();
		
		temp = temp.doDeserralize();
		System.out.println(temp);
		
	}

}

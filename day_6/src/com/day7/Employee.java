package com.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
	
	private int empid;
	private String ename;
	private int salary;
	transient private Address address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String ename, int salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	
	

	public Employee(int empid, String ename, int salary, Address address) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
	
	public void doSerialize()
	{
		try {
			FileOutputStream fos = new FileOutputStream("demo.serial");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(this);
			
			oos.close();
			fos.close();
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public Employee doDeserralize()
	{
		Employee emp = null;
		try {
			FileInputStream fis = new FileInputStream("demo.serial");
			ObjectInputStream ois = new ObjectInputStream(fis);
			emp= (Employee) ois.readObject();
			
			ois.close();
			fis.close();
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}

}

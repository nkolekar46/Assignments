package com.demoSpring;

import java.util.List;

public class Employee {
	
	int empid;
	String ename;
	double basicSalary, PF, PT, HRA, medical, grossSalary, netSalary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	

	public Employee(int empid, String ename, double basicSalary, double pF, double pT, double hRA, double medical,
			double grossSalary, double netSalary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.basicSalary = basicSalary;
		PF = 0.12*this.basicSalary;
		PT = 200;
		HRA = 0.5*this.basicSalary;
		this.medical = medical;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
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



	public double getBasicSalary() {
		return basicSalary;
	}



	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}



	public double getPF() {
		return PF;
	}



	public void setPF(double pF) {
		PF = pF;
	}



	public double getPT() {
		return PT;
	}



	public void setPT(double pT) {
		PT = pT;
	}



	public double getHRA() {
		return HRA;
	}



	public void setHRA(double hRA) {
		HRA = hRA;
	}



	public double getMedical() {
		return (medical=this.medical);
	}



	public void setMedical(double medical) {
		this.medical = medical;
	}



	public double getGrossSalary() {
		return(this.basicSalary+this.HRA+this.medical);
	}



	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}



	public double getNetSalary() {
		return(this.getGrossSalary()-this.PF-this.PT);
	}



	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}



	public void printEmployee() {
		System.out.println("Empid: " + this.empid);
		System.out.println("EName:" + this.ename);
		System.out.println("Gross:" + this.getGrossSalary());
		System.out.println("Net: " + this.getNetSalary());
	}

	
	
	
	

}

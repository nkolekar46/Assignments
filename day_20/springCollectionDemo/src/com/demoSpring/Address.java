package com.demoSpring;

public class Address {
	
	private int pincode;
	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}

	public void print()
	{
		System.out.println("Inside address");
	}
	
	

}

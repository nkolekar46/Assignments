package com.collectionAss;

import java.util.Set;

public class Book {
	
	int id;
	String name;
	double price;
	Set<String> authers;
	
	private void book() {
		// TODO Auto-generated method stub

	}

	public Book(int id, String name, double price, Set<String> authers) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.authers = authers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<String> getAuthers() {
		return authers;
	}

	public void setAuthers(Set<String> authers) {
		this.authers = authers;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", authers=" + authers + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}

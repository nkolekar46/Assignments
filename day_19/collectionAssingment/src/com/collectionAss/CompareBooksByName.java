package com.collectionAss;

import java.util.Comparator;

public class CompareBooksByName implements Comparator<Book>{

	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.getName().compareTo(b2.getName());
	}

}

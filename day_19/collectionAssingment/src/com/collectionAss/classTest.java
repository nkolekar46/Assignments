package com.collectionAss;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.collectionAss.util.PrintUtil;
import com.collectionAss.util.SortUtils;
import com.collectionAss.util.StoreUtil;

public class classTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> auth1= new HashSet<String>();
		Set<String> auth2= new HashSet<String>();
		Set<String> auth3= new HashSet<String>();
		Set<String> auth4= new HashSet<String>();
		
		auth1.add("AAAA");
		auth1.add("AAAA");
		auth2.add("zzz");
		auth2.add("CCCC");
		auth3.add("RRR");
		auth3.add("WWWW");
		auth4.add("EEE");
		auth4.add("PPPP");
		
		
		Book b1 = new Book(1, "ABC", 100, auth1);
		Book b2 = new Book(2, "ZQR", 200, auth2);
		Book b3 = new Book(3, "RST", 300, auth3);
		Book b4 = new Book(4, "EYZ", 400, auth4);
		
		StoreUtil<Book> st = new StoreUtil<Book>();
		st.addRecords(b1);
		st.addRecords(b2);
		st.addRecords(b3);
		st.addRecords(b4);
		
		List<Book> books= st.getRecords();
		PrintUtil.printRecords(books);
		
		SortUtils su = new SortUtils();
		su.sortByName(books);
		PrintUtil.printRecords(books);
		
		

	}

}

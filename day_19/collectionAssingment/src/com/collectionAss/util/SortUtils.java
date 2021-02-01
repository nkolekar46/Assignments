package com.collectionAss.util;

import java.util.Collections;
import java.util.List;

import com.collectionAss.CompareBooksByName;
import com.collectionAss.CompareBooksByPrice;

public class SortUtils {
	
	public static void sortByName(List list)
	{
		Collections.sort(list, new CompareBooksByName());
	}
	public static void sortByPrice(List list)
	{
		Collections.sort(list, new CompareBooksByPrice());
	}
	
	

}

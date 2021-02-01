package com.collectionAss.util;

import java.util.ArrayList;
import java.util.List;

public class StoreUtil<T> {
	
	List<T> list = new ArrayList<T>();
	
	public void addRecords(T data)
	{
		list.add(data);
	}
	
	public List<T> getRecords()
	{
		return this.list;
	}
	
	public int getNumOfRecords()
	{
		
		return list.size();
	}
	
	

}

package com.thinkitive.file;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeFlie();
		readFlie();
	}
	public static void readFlie()
	{
		try(FileReader fr = new FileReader("abc.txt")){
			int i=0;
			while(((i = fr.read()) != -1))
			{
				char ch = (char)i;
				System.out.print((char)i);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static void writeFlie()
	{
		try(FileWriter fr = new FileWriter("abc.txt")){
			fr.write("This my first file");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

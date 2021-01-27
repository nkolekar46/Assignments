package MyCollection;

import java.io.FileReader;
import java.util.Properties;

public class DempProp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		//FileReader fr = new FileReader("demo.txt");
		//prop.load(fr);
			
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("city"));
		System.out.println(prop.getProperty("mobile"));
	}

}

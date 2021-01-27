package MyCollection;

import java.util.*;

public class listExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*		
		List l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40.5);
		l1.add("Hello");
		l1.add(true);
		
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println(l1);
	*/
		
		Employee e = new Employee(10, "abc", 20000);
		Employee e1 = new Employee(20, "pqr", 30000);		
		Employee e2 = new Employee(30, "xyz", 40000);
		Employee e3 = new Employee(30, "xyz", 40000);
		
		Set l = new HashSet();
		l.add(e3);
		l.add(e);
		l.add(e1);
		l.add(e2);
		
		System.out.println(l);
		
		l.contains(e1);
		System.out.println(l.contains(e1));
		System.out.println(l.isEmpty());
		System.out.println(l.add(e1));
	}

}

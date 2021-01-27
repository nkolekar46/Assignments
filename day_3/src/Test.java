
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Employee e = new Employee(1, "ABC");
		Employee e1 = new Employee(1, "ABC");
		System.out.println(e);
		System.out.println(e1);
		
		System.out.println(e.equals(e1));
		
		System.out.println(e.hashCode());
		*/
		
		
		Employee e = new Employee("abc", "pqr", "xyz");
		Employee e1 = new Employee("abc", "pqr", "xyz");
		System.out.println(e.equals(e1));
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
	}

}

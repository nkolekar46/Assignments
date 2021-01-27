package MyCollection;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack<Integer> m = new MyStack<Integer>();
		
		m.push(22);
		m.push(11);
		
		m.printStack();
		
		MyStack<Employee> m1 = new MyStack<Employee>();
		Employee e = new Employee(1,"abc", 200);
		Employee e1 = new Employee(2,"abc", 200);
		Employee e2 = new Employee(3,"abc", 200);
		
		m1.push(e);
		m1.push(e1);
		m1.push(e2);
		
		m1.printStack();
	}

}

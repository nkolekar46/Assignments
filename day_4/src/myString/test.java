package myString;

public class test{
	// only created myInterface and in that just created one method perfornaction 
	// in this class created an reference of that interface to create an anonymous classes. 

	public static void main(String[] args) {
	
		Demo d = new Demo();
		System.out.println(d.performAction(10, 20));
		
		myInterface add = new myInterface() {
			
			@Override
			public int performAction(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		
		myInterface sub = new myInterface() {
			
			@Override
			public int performAction(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		
		myInterface mul = new myInterface() {
			
			@Override
			public int performAction(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};

		myInterface div = new myInterface() {
			
			@Override
			public int performAction(int a, int b) {
				// TODO Auto-generated method stub
				return a/b;
			}
		};
		
		System.out.println("Addition ="+add.performAction(10, 2));
		System.out.println("Substraction ="+sub.performAction(20, 2));
		System.out.println("Multiplication ="+mul.performAction(20, 2));
		System.out.println("Division="+div.performAction(40, 4));

	}
	

}

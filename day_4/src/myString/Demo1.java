package myString;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		myInterface add = ( a,b) -> a+b;
	
		myInterface sub = ( a,b) -> a-b;		
		
		myInterface mul = ( a,b) -> a*b;

		myInterface div = (a,b) ->  a/b;
		
		System.out.println("Addition ="+add.performAction(10, 2));
		System.out.println("Substraction ="+sub.performAction(20, 2));
		System.out.println("Multiplication ="+mul.performAction(20, 2));
		System.out.println("Division="+div.performAction(40, 4));	
		
	
		hello((a,b) -> a+b);
	}	
	
	
	public static void hello(myInterface add)
	{
		System.out.println(add.performAction(10, 2));
	}

}

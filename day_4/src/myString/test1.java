package myString;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		Hello();
	} catch (ClassNotFoundException e) {
		System.out.println("check name");
	}
	}
	
	public static void Hello() throws ClassNotFoundException
	{
		String s= "hello";
		int arr[] = {10, 20, 30};
		try {
			System.out.println(s.length());
		System.out.println(arr[5]);	
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array length is "+arr.length);
			
		}
	//	Class.forName("myString");
	
		
		int age =11;
		if(age>18 && age <35)
			System.out.println("Admission successful");
		else
		{
			InvalidAgeException ag = new InvalidAgeException();
			throw ag;
		}
	
//	NumberFormatException e = new NumberFormatException();//checked exception
//	throw e;
	
	
	}
	
	


}

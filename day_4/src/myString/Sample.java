
package myString;

public class Sample {

	public static void main(String[] args) {
		
		String s= "Hello how are you??";
		System.out.println(s);		
		System.out.println("*************************************");

		System.out.println(s.length());
		
		String arr[] = s.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		String revString = "";
		
		System.out.println("*************************************");
		System.out.println("Make first letter of a string capital without using replace method");
		
		
		System.out.println("*************************************");

		System.out.println("Reverse a string");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println("*************************************");
		
		System.out.println("Make first letter of each word capital");
		
		
		
		System.out.println("*************************************");
		
		System.out.println("Reverse every word in a string");
		for(int i=0; i<arr.length; i++)
		{
			String word = arr[i];
			String revWords ="";
			for(int j=word.length()-1; j>=0; j--)
			{
				revWords = revWords + word.charAt(j);
			}
			revString = revString + revWords+" ";
		}
		System.out.println(revString);
		
		System.out.println("*************************************");
		
		System.out.println("Find word frequency count");
		
		
		
		System.out.println("*************************************");
	
		
		String str1 = new String();
		str1="abc";
		String str2=str1+"xyz";
		System.out.println(str2);
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" world");
		System.out.println(sb);
		
		StringBuilder sbu = new StringBuilder("Hello");
		sbu.reverse();
		System.out.println(sbu);
		
		
		
		
		
		
		
		
		
		
	}
}

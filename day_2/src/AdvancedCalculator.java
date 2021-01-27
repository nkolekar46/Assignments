
public class AdvancedCalculator extends Calculator{
	public int mod(int a, int b)
	{
		return a%b;
	}
	
	public Calculator div(int a, int b)
	{
		System.out.println(super.div(a,b));
		return null;
	}	
	
	
}

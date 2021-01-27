
public class Test {

	public static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		
		e.setEmpid(20);
		e.setEname("Abc");
		e.setSalary(20000);
		e.printRecord();
	
		
		System.out.println(e.getEmpid());
		System.out.println(e.getEname());
		System.out.println(e.getSalary());
		System.out.println(count);
		System.out.println(Employee.count);
		
		System.out.println("****************************");
		
		
		Calculator ac = new AdvancedCalculator();
		
		System.out.println(ac.add(2, 33));
		//System.out.println(ac.mod(8,2));
		
		System.out.println(ac.div(10, 2));
		
		
	}

}

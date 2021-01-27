
public class Employee {
	
	private int empid;
	private String ename;
	private int salary;
	 
	public static int count=0;
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee()
	{
		
	}
	
	/**
	 * print record
	 */
	
	public void printRecord()
	{
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(salary);
	}
	

}

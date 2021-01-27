
public class Employee {

	/*int empid;
	String ename;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empid, String ename) {
		// TODO Auto-generated method stub
		this.empid = empid;
		this.ename = ename;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id:"+empid+" ,Name:"+ename;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee)obj;
		if(this.empid == e.empid)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empid;*/
	
		String str = "abc";
		String str1 = "abc";
		String str2 = "abc";
		public String getStr() {
			return str;
		}
		public void setStr(String str) {
			this.str = str;
		}
		public String getStr1() {
			return str1;
		}
		public void setStr1(String str1) {
			this.str1 = str1;
		}
		public String getStr2() {
			return str2;
		}
		public void setStr2(String str2) {
			this.str2 = str2;
		}
		public Employee(String str, String str1, String str2) {
			super();
			this.str = str;
			this.str1 = str1;
			this.str2 = str2;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((str == null) ? 0 : str.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (str == null) {
				if (other.str != null)
					return false;
			} else if (!str.equals(other.str))
				return false;
			return true;
		}
		
		
		
	

}


package POJO;

public class EmployeeDetailsIntArray {
	String eName;
	String eID;
	int[] phoneNo;
	int salary;
	
	public EmployeeDetailsIntArray(String eName, String eID, int[] phoneNo, int salary) {
		this.eName= eName;
		this.eID =eID;
		this.phoneNo= phoneNo;
		this.salary = salary;
		
		
		
		
	}

	public EmployeeDetailsIntArray() {
		
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteID() {
		return eID;
	}

	public void seteID(String eID) {
		this.eID = eID;
	}

	public int[] getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int[] phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}

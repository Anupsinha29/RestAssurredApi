package POJO;

public class EmployeeDetails {
	
	
	String ename;
	String eId;
	String[] MailId;
	public int salary;
	Spouse s;
	

	
	public EmployeeDetails(String ename, String eId, String[] mailId, int salary,
			Spouse s) {
		super();
		this.ename = ename;
		this.eId = eId;
		MailId = mailId;
		this.salary = salary;
		this.s = s;
	}



	public EmployeeDetails() {
	
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String geteId() {
		return eId;
	}



	public void seteId(String eId) {
		this.eId = eId;
	}



	public String[] getMailId() {
		return MailId;
	}



	public void setMailId(String[] mailId) {
		MailId = mailId;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public Spouse getSpouse() {
		return s;
	}



	public void setSpouse(Spouse s) {
		this.s = s;
	}


	
	
}

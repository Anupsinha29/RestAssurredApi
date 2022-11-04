package POJO;

public class Employee {
	
	String sName;
	String eID;
	int phoneNo;
	String address;
	String MailId;
	
	public Employee(String sName, String eID, int phoneNo, String address, String mailId) {
		super();
		this.sName = sName;
		this.eID = eID;
		this.phoneNo = phoneNo;
		this.address = address;
		MailId = mailId;
	}
	//comment

	public Employee() {
		
	}


	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String geteID() {
		return eID;
	}

	public void seteID(String eID) {
		this.eID = eID;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMailId() {
		return MailId;
	}

	public void setMailId(String mailId) {
		MailId = mailId;
	}
	
}

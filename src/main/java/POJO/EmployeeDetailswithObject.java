package POJO;

public class EmployeeDetailswithObject {
	
	String eName;
	String eID;
	Object Spouse;
	
	
	public EmployeeDetailswithObject() {
		
	}
	public EmployeeDetailswithObject(String eName, String eID, Object Spouse ) {
		super();
		this.eName = eName;
		this.eID = eID;
		this.Spouse = Spouse;
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
	public Object getSpouse() {
		return Spouse;
	}
	public void setSpouse(Object spouse) {
		Spouse = spouse;
	}
	
	

}

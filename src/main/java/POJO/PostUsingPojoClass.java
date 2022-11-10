package POJO;

public class PostUsingPojoClass {
	
	String createdBy;
	String projectName;
	String status;
	int teamsize;
	
	
	
	public PostUsingPojoClass() {
		
	}



	public PostUsingPojoClass(String createdBy, String projectName, String status, int teamsize) {
		
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamsize = teamsize;
	}



	public String getCreatedBy() {
		return createdBy;
	}



	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public int getTeamsize() {
		return teamsize;
	}



	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	
	
	
	
	
	
	
	
}

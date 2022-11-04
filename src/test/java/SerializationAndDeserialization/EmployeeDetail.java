package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.Employee;
import POJO.EmployeeDetails;
import POJO.Spouse;

public class EmployeeDetail {
	
	@Test
	public void employeedetail() throws JsonGenerationException, JsonMappingException, IOException {
		
		Employee emp = new Employee("As", "tyss",725097,"Ranchi","anupsinhacse@gmail.com");
		//System.out.println(emp.salary);
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("employeeDetails.json"), emp);
		
	}

}

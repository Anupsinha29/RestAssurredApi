package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.Employee;
import POJO.EmployeeDetails;



public class Deserialization {
	@Test
	public void deserialization() throws IOException {
		ObjectMapper obj = new ObjectMapper();
		Employee value = obj.readValue(new File("./employeeDetails.json"), Employee.class);
		value.getAddress();
		System.out.println(value.getAddress());
		

		
	}

}

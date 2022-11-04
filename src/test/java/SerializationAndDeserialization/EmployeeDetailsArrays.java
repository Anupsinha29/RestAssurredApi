package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.EmployeeDetailsIntArray;

public class EmployeeDetailsArrays {
	
	@Test
	
	public void employeedetailsArrays() throws JsonGenerationException, JsonMappingException, IOException {
		int[] abc = {23,78,89};
		
		EmployeeDetailsIntArray empa = new EmployeeDetailsIntArray("AKS", "Ty", abc, 567);
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("employeedetailsArrays.json"), empa);
	}

}

package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.EmployeeDetailswithObject;
import POJO.Spouse;

public class EmployeedetailsObject {
	Spouse sp = new Spouse("anand","aks");
	@Test
	public void employeedetailsobject() throws JsonGenerationException, JsonMappingException, IOException {
		
		
		EmployeeDetailswithObject ob = new EmployeeDetailswithObject("Anand", "tyss", sp);
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("employeedetailsobject.json"), ob);
	}

}
 
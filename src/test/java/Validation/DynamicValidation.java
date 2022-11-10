package Validation;
import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class DynamicValidation {

	@Test
	public void dynamicValidation() {
		String actdata ="TY_PROJ_5927";
		baseURI = "http://rmgtestingserver";
		port =8084;
		Response resp =when().get("/projects");
		boolean flag=false;
		List<String> pid = resp.jsonPath().get("projectId");
		for(String project:pid) {
			if(project.equalsIgnoreCase(actdata)) {
				flag = true;
				
			}
		}
		Assert.assertTrue(flag);
		System.out.println("TestCase pass");
		resp.then().assertThat().statusCode(200).log().all();
		
	}
}

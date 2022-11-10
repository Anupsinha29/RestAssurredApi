package Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class DynamicResponseValidation {
	
	@Test
	public void dynamicResponseValidation() {
		
		RequestSpecification reqspec = RestAssured.given();
		Response response = reqspec.get("http://rmgtestingserver:8084/projects");
		JsonPath path =response.jsonPath();
		String value =path.getString("projectName");
		
		Assert.assertTrue(value.contains("maniqsl2"));
		
		
	}
}

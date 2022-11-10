package Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static io.restassured.RestAssured.*;


public class StaticResponseValidation {
	
	
	@Test
	public void staticresponseValidation() {
		String expData ="TY_PROJ_1013";
		baseURI ="http://rmgtestingserver";
		port = 8084;
		
		//action
		Response resp = when()
				.get("/projects");
		
		
		
		//Validation
		String actData =resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(actData, expData);
		System.out.println("data is verified");
		resp.then().log().all();
		
		
	}

}

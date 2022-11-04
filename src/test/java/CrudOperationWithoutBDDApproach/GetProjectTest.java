package CrudOperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetProjectTest {
	@Test
	public void getProject() {
		
		
		
		RequestSpecification reqSpec =RestAssured.given();
		
		
		Response response = reqSpec.get("http://rmgtestingserver:8084/Projects");
		
		ValidatableResponse valResponse = response.then();
		valResponse.assertThat().statusCode(200);
		valResponse.log().all();
		
		
		
		
		
		
		
		
		
	}

}

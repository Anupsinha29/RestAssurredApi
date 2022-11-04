package CrudOperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest {
	@Test
	public void addProjectTest() {
		
		
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Anuppppppp");
		jObj.put("projectName", "Tyhss1223400");
		jObj.put("status", "created4237");
		jObj.put("teamSize", 22314);
		
		//preconditions
		RequestSpecification reqSpec =RestAssured.given();
		reqSpec.body(jObj);
		reqSpec.contentType(ContentType.JSON);
		
	
		//actions
        Response response = reqSpec.post("http://rmgtestingserver:8084/addProject");
		
		
		
		//validation
		ValidatableResponse valResponse = response.then();
		valResponse.assertThat().contentType(ContentType.JSON);
		valResponse.assertThat().statusCode(201);
		valResponse.log().all();
		
	}
	
	

}

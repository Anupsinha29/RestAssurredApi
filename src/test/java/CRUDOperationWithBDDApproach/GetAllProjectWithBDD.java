package CRUDOperationWithBDDApproach;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAllProjectWithBDD {
	
	@Test
	public void getallprojectwithbdd() {
		
		
		when()
		.get("http://rmgtestingserver:8084/projects").then().statusCode(200).log().all();
		
		
		
		
	}

}

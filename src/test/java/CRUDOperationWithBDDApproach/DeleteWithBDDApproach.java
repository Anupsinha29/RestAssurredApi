package CRUDOperationWithBDDApproach;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteWithBDDApproach {

	@Test
	
	public void deleteWithBddApproach() {
		
		//the
		when()
		.get("http://rmgtestingserver:8084/projects/TY_PROJ_4178").then().statusCode(200).log().all();
		
		
	}
}

package CRUDOperationWithBDDApproach;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutWithBDDApproach {
	
	@Test
	
	public void putwithbddApproach() {
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "AnupKumarwemeet");
		jobj.put("projectName", "Tystyty");
		jobj.put("status", "created42376rt");
		jobj.put("teamSize", 223145489);
		
		//precondition
		given().body(jobj).contentType(ContentType.JSON).when().put("http://rmgtestingserver:8084/projects/TY_PROJ_4178").then().statusCode(200).log().all();
		
		
	}

}

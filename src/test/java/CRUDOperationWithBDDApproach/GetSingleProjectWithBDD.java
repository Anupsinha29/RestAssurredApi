package CRUDOperationWithBDDApproach;

import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.*;

public class GetSingleProjectWithBDD {
	@Test
	public void getwithbddapproach() {
		
		JSONObject jobj = new JSONObject();
		given().body(jobj).contentType(ContentType.JSON).when().get("http://rmgtestingserver:8084/projects/TY_PROJ_4178").then().statusCode(200).log().all();
		
		
		
	

}
}
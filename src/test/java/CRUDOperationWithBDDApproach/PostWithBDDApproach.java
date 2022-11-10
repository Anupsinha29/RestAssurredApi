package CRUDOperationWithBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;



public class PostWithBDDApproach {
@Test
	public void postwithBddapproach() {
		//Random ran = new Random();
		//int r= ran.nextInt(1000);
	RandomNum r=new RandomNum();
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "AnupKumarwe");
		jobj.put("projectName", "Tysty"+r.ran(100));
		jobj.put("status", "created42376r");
		jobj.put("teamSize", 2231454);
		
		//precondition
		given().body(jobj).contentType(ContentType.JSON).when().post("http://rmgtestingserver:8084/addProject").then().statusCode(201).log().all();
		
		
		

	}

}

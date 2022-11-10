package Parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;
import io.restassured.http.ContentType;

public class PathparameterforUpdateProject {
	
	
	@Test
	public void pathParameterforAllProject() {
		 RandomNum ran = new RandomNum();
		baseURI ="http://rmgtestingserver";
		port =8084;
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "AnupKumarwemeetr");
		jobj.put("projectName", "Tystyty"+ran.ran(1000));
		jobj.put("status", "created42376rt");
		jobj.put("teamSize", 223145489);
		given().pathParam("pid", "TY_PROJ_5529").body(jobj).
		contentType(ContentType.JSON)
		.when().put("/projects/{pid}")
		.then().assertThat().statusCode(200);
		
		
		
	}
	

}

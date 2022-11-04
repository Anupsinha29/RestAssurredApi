
	

package CrudOperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	@Test
	public void addProjectTest() {
		
		
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Anuppppppp");
		jObj.put("projectName", "Tyss12423400");
		jObj.put("status", "created4237");
		jObj.put("teamSize", 2214);
		
		//preconditions
		RequestSpecification reqSpec =RestAssured.given();
		reqSpec.body(jObj);
		reqSpec.contentType(ContentType.JSON);
		
	
		//actions
        Response response = reqSpec.put("http://rmgtestingserver:8084/projects/TY_PROJ_4121");
		
		
		
		//validation
		ValidatableResponse valResponse = response.then();
		valResponse.assertThat().contentType(ContentType.JSON);
		valResponse.assertThat().statusCode(200);
		valResponse.log().all();
		
	}
	
	

}


package CrudOperationWithoutBDDApproach;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import JavaUtility.RandomNum;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NegativeTestCase4 {
RandomNum ra = new RandomNum();

	@Test
	public void negativetestcase4() {
		
		JSONObject jObj = new JSONObject();
		
		jObj.put("createdBy", "Anupfhyjppwq12e");
		jObj.put("projectName", "Tyiysjjs2234er0096112"+ra.ran(1000));
		jObj.put("status", "creagtehf3721a5");
		jObj.put("teamSize", 211d);
		
		//preconditions
		RequestSpecification reqSpec =RestAssured.given();
		reqSpec.body(jObj);
		reqSpec.contentType(ContentType.JSON);
		//actions
	    Response response = reqSpec.post("http://rmgtestingserver:8084/addProject");
	    System.out.println(response.getContentType());
	   System.out.println(response.getSessionId());
	    System.out.println(response.getStatusCode());
	    System.out.println(response.getStatusLine());
	    System.out.println(response.getTime());
	    System.out.println(response.getTimeIn(TimeUnit.MICROSECONDS));
	    System.out.println(response.asPrettyString());
	    System.out.println(response.prettyPrint());
	    System.out.println(response.prettyPeek());
		//validation
		ValidatableResponse valResponse = response.then();
		valResponse.assertThat().contentType(ContentType.JSON);
		valResponse.assertThat().statusCode(209);
		valResponse.log().all();
		
		}

}

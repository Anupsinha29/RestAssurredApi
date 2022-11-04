package CrudOperationWithoutBDDApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetSingleProjectTest {
	@Test
	public void getsingleproject() {
	
	RequestSpecification reqSpec =RestAssured.given();
	
	
	Response response = reqSpec.get("http://rmgtestingserver:8084/projects/TY_PROJ_3904");
	
	ValidatableResponse valResponse = response.then();
	valResponse.assertThat().statusCode(200);
	valResponse.log().all();

}
}
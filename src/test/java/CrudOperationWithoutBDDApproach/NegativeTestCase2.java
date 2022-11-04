package CrudOperationWithoutBDDApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NegativeTestCase2 {
	@Test
	public void negativetestcase() {
		
RequestSpecification reqSpec =RestAssured.given();
		
		
		Response response = reqSpec.delete("http://rmgtestingserver:8084/projects/TY_PROJ_3904");
		
		ValidatableResponse valResponse = response.then();
		valResponse.assertThat().statusCode(204);
		valResponse.log().all();
		
	}

}

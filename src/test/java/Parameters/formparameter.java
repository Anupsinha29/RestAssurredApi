package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class formparameter {
	
	@Test
	public void formparameterbody() {
		port =8084;
		given()
		.formParam("createdBy","Anuppp")
		.formParam("projectName", "zolandooo3")
		.formParam("status","passed")
		.formParam("teamSize", 67)
		.contentType(ContentType.JSON);
		
		
		
		
		
	}

}

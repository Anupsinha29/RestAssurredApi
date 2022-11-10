package Parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Queryparameter {
	
	
	@Test
	public void queryparameter() {
	
		baseURI ="http://reqres.in";
		
		given().queryParam("page", "8")
		
		.when().get("/api/users")
		.then().assertThat().statusCode(200).log().all();
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}

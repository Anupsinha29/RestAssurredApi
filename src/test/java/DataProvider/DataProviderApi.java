package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DifferentWaysToCreateObject.PostUsingJsonObject;
import JavaUtility.RandomNum;
import POJO.PostUsingPojoClass;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;



public class DataProviderApi {
	
	@Test(dataProvider ="getData")
	public void usingDataProvideraa(String createdBy, String projectName, String status, int teamsize ) {
		 
	RandomNum ra = new RandomNum();
	
	PostUsingPojoClass pj = new PostUsingPojoClass(createdBy, projectName+ra.ran(100),status, teamsize);
	given()
	.body(pj)
	.contentType(ContentType.JSON)
	.when()
	.post("http://rmgtestingserver:8084/addProject").then().statusCode(201).log().all();
	
	
	
	
	}
	@DataProvider(name="getData")
	public Object[][] data(){
	Object[][] data = new  Object[4][4];
	
	data[0][0]="Anupooo";
	data[0][1]="Automation Testingoo";
	data[0][2]="Completed";
	data[0][3]=5;
	
	data[1][0]="Aanadoo";
	data[1][1]="Mining00";
	data[1][2]="Completed";
	data[1][3]=10;
	
	data[2][0]="Gaganoo";
	data[2][1]="BasketBall00";
	data[2][2]="Completed";
	data[2][3]=9;
	
	
	data[3][0]="Vikashoo";
	data[3][1]="Football00";
	data[3][2]="Completed";
	data[3][3]=11;
	
	
	return data;
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
	
}

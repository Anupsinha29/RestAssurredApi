package DataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DifferentWaysToCreateObject.PojoClass;
import ExcelUtility.ExcelUtility;
import JavaUtility.RandomNum;
import POJO.PostUsingPojoClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*
;public class GetDataFromExcel {
	@Test(dataProvider="getDataByExcel")
	public void dataTest(String createdBy,String projectName, String status,String teamSize) {
		
		
		
		RandomNum ra = new RandomNum();
		JSONObject obj = new JSONObject();
		obj.put("createdBy", createdBy);
		obj.put("projectName", projectName+ra.ran(200));
		obj.put("status", status);
		obj.put("teamsize", teamSize);
		
		//Precondition
		RequestSpecification reqspec =RestAssured.given();
		reqspec.body(obj);
		reqspec.contentType(ContentType.JSON);
		
		
		//Actions
		Response response = reqspec.post("http://rmgtestingserver:8084/addProject");
		response.getContentType();
		ValidatableResponse valResponse = response.then();
		valResponse.assertThat().contentType(ContentType.JSON);
		valResponse.assertThat().statusCode(201);
		valResponse.log().all();
	 		
	}
	
	@DataProvider(name="getDataByExcel")
	public Object[][] getDataByExcel() throws EncryptedDocumentException, IOException{
		ExcelUtility eu = new ExcelUtility();
	//	RandomNum ran = new RandomNum();
		
		Object[][] data = eu.readMultipleFromExcel("Sheet1");
		
		
		return data;
		
		
	}

	
	}
	

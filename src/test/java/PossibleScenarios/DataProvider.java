package PossibleScenarios;

import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider="")
	@org.testng.annotations.DataProvider
	public void TestData(String user,String pwd)
	{
		System.out.println("Usename"+user);	
	    System.out.println("Password"+pwd);
	    
}
	@org.testng.annotations.DataProvider(name="data")
	public void getdata()
	{
		Object[][] obj=new Object[3][2];
		
				
	}

}
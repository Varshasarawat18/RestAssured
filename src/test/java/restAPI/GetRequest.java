package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	
	
	@Test
	public void test1()
	{
		
		RestAssured.baseURI="http://localhost:3000";
		
		RequestSpecification request= RestAssured.given();   //RequestSpecification class that alloq adding request   
																//given is a method that is creating a request		
		Response response =request.get("employees");        //	Response is class
		
		System.out.println(response.getBody().asString());
	}

}

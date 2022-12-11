package restXMLAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.internal.path.xml.NodeChildrenImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class XMLExample {
	
	@Test
	public void Test1()
	{
		
		RestAssured.baseURI= "https://chercher.tech/sample/api/books.xml";
		RequestSpecification Request = RestAssured.given();
		
		Response Response =Request.get();
		System.out.println(Response.getBody().asString());
		
		NodeChildrenImpl AllBooks= Response.then().extract().path("bookstore.book.title");
		System.out.println(AllBooks + " ");
		System.out.println("First book name is : " + AllBooks.get(0));
		System.out.println("Second book name is : " + AllBooks.get(1));
		
		System.out.println("First book langu is " + AllBooks.get(0).getAttribute("lang"));
		System.out.println("First book langu is " + AllBooks.get(1).getAttribute("lang"));

		
		
	}
	
}

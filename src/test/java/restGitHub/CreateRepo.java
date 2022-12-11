package restGitHub;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateRepo {
	
	@Test
	public void test1()
	{
		File filename= new File ("DataGitHubRepo.json");
		
		RestAssured.given()
						.auth()
						.oauth2("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")
						.baseUri("https://api.github.com")		
						.contentType(ContentType.JSON)
						.accept(ContentType.JSON)
						.body(filename)
						.when()
						.post("user/repos")
						.then()
						.log()
						.all()
						.statusCode(201);
	}

}

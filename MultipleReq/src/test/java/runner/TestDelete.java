package runner;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.specification.RequestSpecification;

public class TestDelete {

	@Test
	public void test()
	{
		baseURI = "https://reqres.in/api/";
		given().
		when().
			delete("users/2").
		then().assertThat().statusCode(204);
	}
	
	@Test
	public void testPost()
	{
		baseURI = "https://reqres.in/api/";
		RequestSpecification req = given();
			
		req.header("Content-Type","application/JSON");
		
//		JSONObject requestParams = new JSONObject();
//		requestParams.put("name", "morpheus");
//		requestParams.put("job", "leader");
		
		req.body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}");
		
		req.when().
			post("/api/users").
		then().
			assertThat().statusCode(201);
	}
	
}

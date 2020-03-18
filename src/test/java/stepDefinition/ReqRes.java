package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ReqRes {
	
	RequestSpecification req;
	Response req1;
	
	@Given("the baseURI is set as {string}")
	public void the_baseURI_is_set_as(String string) {
	    baseURI = string;
	}

	@Given("the paramater {string} is set as {string}")
	public void the_paramater_is_set_as(String string, String string2) {
	    req = given().param(string, string2);
	}

	@When("a GET request is made on {string}")
	public void a_GET_request_is_made_on(String string) {
	    req1 = req.get(string);
	}

	@Then("verify response status code is {int}")
	public void verify_response_status_code_is(Integer int1) {
	    req1.then().statusCode(int1);
	}

	@Then("the {string} is {int}")
	public void the_is(String string, int string2) {
	    req1.then().assertThat().body(string, equalTo(string2));
	}
}
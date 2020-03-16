package stepDefinition;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

import java.util.List;

import org.json.simple.JSONObject;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import properties.PropertiesReader;

public class JSONServer {
	
	Response res;
	RequestSpecification req;
	PropertiesReader config = PropertiesReader.getInstance();
	
	
	@Given("the baseURI is set to {string}")
	public void the_baseURI_is_set_to(String string) {
	    baseURI = config.get(string);
	}

//	@When("a GET request is made")
//	public void a_GET_request_is_made() {
//	    res = given().when().get();
//	}
//
//	@Then("verify the size of users list to be {int}")
//	public void verify_the_size_of_users_list_to_be(Integer int1) {
//	    res.then().assertThat().statusCode(200).and().body("users", hasSize(int1));
//	}
//	
//	@When("a DELETE request is made on path {string}")
//	public void a_DELETE_request_is_made_on_path(String string) {
//	    res = given().when().delete(string);
//	}
//
//	@Then("verify the status code is {int} and size is {int}")
//	public void verify_the_status_code_is_and_size_is(Integer int1, Integer int2) {
//	    res.then().statusCode(int1);
//	    given().when().get().then().assertThat().body("users", hasSize(int2));
//	}
//	
//	@Given("name is set as {string}")
//	public void name_is_set_as(String string) {
//	    req = given();
//	    req.header("Content-Type","application/JSON");
//	    JSONObject json = new JSONObject();
//	    json.put("name",string);
//	    req.body(json.toJSONString());
//	}
//
//	@When("a PUT request is made on path {string}")
//	public void a_PUT_request_is_made_on_path(String string) {
//	    res = req.when().put(string);
//	}
//
//	@Then("verify that status code is {int} and name is {string}")
//	public void verify_that_status_code_is_and_name_is(Integer int1, String string) {
//		String name = res.getBody().asString();
//	    res.then().statusCode(int1);
//	    Assert.assertTrue(name.contains(string));
//	}
	
	
//	@Given("id is set as {int} and name is set as {string}")
//	public void id_is_set_as_and_name_is_set_as(Integer int1, String string) {
//	    req = given();
//	    req.header("Content-Type","application/json");
//	    JSONObject js = new JSONObject();
//	    js.put("name",string);
//	    js.put("id",int1);
//	    req.body(js.toJSONString());
//	}
//
//	@When("POST request is made")
//	public void post_request_is_made() {
//	    res = req.when().post();
//	}

//	@Then("verify the number of users")
//	public void verify_the_number_of_users() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	
//	@Given("name is set as {string} and age is set as {int}")
//	public void name_is_set_as_and_age_is_set_as(String string, int string2) {
//	    req = given();
//	    req.header("Content-Type","application/JSON");
//	    JSONObject js = new JSONObject();
//	    js. put("name",string);
//	    js.put("age",string2);
//	    req.body(js.toJSONString());
//	}
//
//	@When("POST request is made on {string}")
//	public void post_request_is_made_on(String string) {
//	    res = req.when().post(string);
//	}
//
//	@Then("verify status code is {int}")
//	public void verify_status_code_is(Integer int1) {
//	    res.then().statusCode(int1);
//	}
	
	@When("GET request is made on {string}")
	public void get_request_is_made_on(String string) {
	    res = given().when().get(config.get(string));
	}

	@Then("verify status code is {int}")
	public void verify_status_code_is(Integer int1) {
	    res.then().statusCode(int1);
	}

	@Then("print names of all admins")
	public void print_names_of_all_admins() {
	    List<String> adminnames = res.then().extract().jsonPath().getList("name");
	    for(String adminname : adminnames)
	    {
	    	System.out.println(adminname+"\n");
	    }
	}
}

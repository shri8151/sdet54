package validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import io.restassured.response.Response;

public class DynmicValidation {
	@Test
	public void dynamicVal() {
		String expData="TY_PROJ_9563";
		baseURI="http://rmgtestingserver";
		port=8084;
		//perform action
		Response res = when().get("/projects");
		//validation.
		boolean flag = false;
		List<String> pid = res.jsonPath().get("projectId");
		for(String pids:pid) {

			if(pids.equalsIgnoreCase(expData)) {
				flag=true;
			}
		}
		Assert.assertTrue(flag);
		Reporter.log("data is verified");  
	res.then().log().all();


	}
}

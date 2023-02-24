package validation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class StaticValidation {

	@Test
	public void staticVal() {
		String expData="TY_PROJ_11111";
		baseURI="http://rmgtestingserver";
		port=8084;
		
		Response res = when().get("/projects");

		//validation
		String actData = res.jsonPath().get("[0].projectId"); 
		System.out.println(actData);
		Assert.assertEquals(actData, expData);
		System.out.println("Data verified");
		res.then()
		.assertThat()
		.log().all();
		
		
	}
}

package crud_Without_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Read_Specific_Project {

	@Test
	public void readproject() {

	 	RequestSpecification req= RestAssured.given()
	.contentType(ContentType.JSON);
		Response response=req.get("http://rmgtestingserver:8084/projects/TY_PROJ_16221");

		response.then().log().all();
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.prettyPrint());
		System.out.println(response.prettyPeek());
	}
}
 
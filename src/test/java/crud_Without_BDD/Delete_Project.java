package crud_Without_BDD;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_Project {

	
	@Test
	public void deleteproject() {
		
		RequestSpecification req= RestAssured.given();
	    req.contentType(ContentType.JSON);
		Response response=req.delete("http://rmgtestingserver:8084/projects/TY_PROJ_16077");
	   
	    response.then().log().all();
			System.out.println(response.getStatusCode());
			System.out.println(response.asString());
			System.out.println(response.prettyPrint());
			System.out.println(response.prettyPeek());
	}
}

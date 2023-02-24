package crud_Without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update_Project {

	@SuppressWarnings("unchecked")
	@Test
	public void updateproject() {
		//step:1 create prerequisites -request body
		
		JSONObject json1=new JSONObject();
		json1.put("createdBy", "shrikanthk");
		json1.put("projectName", "rmg-ty-01");
		json1.put("status", "ongoing");
		json1.put("teamSize", 19);
		
		RequestSpecification req= RestAssured.given();
		req.body(json1);
		req.contentType(ContentType.JSON);
		
		
		//step:2 perform the action.
		Response response=req.put("http://rmgtestingserver:8084/projects/TY_PROJ_16077");
		
		
		//step:3 validate the response.
		 response.then().log().all();
			System.out.println(response.getStatusCode());
			System.out.println(response.asString());
			System.out.println(response.prettyPrint());
			System.out.println(response.prettyPeek());
}
}

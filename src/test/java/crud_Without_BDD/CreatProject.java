package crud_Without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class CreatProject {
	
	@SuppressWarnings("unchecked")
	@Test
	public void createproject() {
		//step:1 create prerequisites -request body
		JSONObject json1=new JSONObject();
		int random=(int) Math.floor(Math.random()*500);
		json1.put("createdBy", "shrikanth");
		json1.put("projectName", "rmg-tyu-01"+random);
		json1.put("status", "ongoing");
		json1.put("teamSize", 23);
		
		RequestSpecification req= RestAssured.given();
		req.body(json1);
		req.contentType(ContentType.JSON);
		
		
		//step:2 perform the action.
		Response response=req.post("http://rmgtestingserver:8084/addProject");
		
		
		//step:3 validate the response.
	    response.then().log().all();
	    
		int actStatus = response.getStatusCode();
		Assert.assertEquals(actStatus, 201);
		System.out.println(response.asString());
		System.out.println(response.prettyPrint());
		System.out.println(response.prettyPeek());
		
	}
	

}

package request_chaining;

import org.testng.annotations.Test;

import JavaLibrary.Jlib;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclassLibrary.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class RequestChaining {
	
	 @Test
	 public void getPojectTest() {
		 //prerequistes-create body
		ProjectLibrary p=new ProjectLibrary("shri", "ty"+Jlib.random(300), "ongoing", 29);
		baseURI="http://rmgtestingserver";
		port=8084;
	Response response = given().body(p).contentType(ContentType.JSON)
		//perform action
		.when().post("/addProject");
		 
	//store project id by using jsonpath
	String proid = response.jsonPath().get("projectId");
		System.out.println(proid);
		System.out.println(response.getTime());
	
	//create get request and pass the proid as path parameter 	
		given().pathParam("pid",proid).when().get("/projects/{pid}").then().log().all();
		
		
		   
		 
	 }

}

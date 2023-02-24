import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.EndPointsLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import pojoclassLibrary.ProjectLibrary;

public class CreateProjectAndVerifyInDatabase extends BaseClass {

	@Test
	public void createPtoject() throws SQLException {
		ProjectLibrary p=new ProjectLibrary("shri", "rmfgh", "on", 23);
		
		 Response resp = given().body(p).contentType(ContentType.JSON)
				. when().post(EndPointsLibrary.ADD_PROJECT);
		
		String expData = resp.jsonPath().get("projectId");
				 
		//validate the id from database
		String query="select * from project";
		String actData=db.verifyDataBase(query, 1, expData);
		
		Assert.assertEquals(expData, actData);
		System.out.println("Tc pass"); 
		resp.then().log().all();
		 
	}
}

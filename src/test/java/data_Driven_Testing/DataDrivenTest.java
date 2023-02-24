package data_Driven_Testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import JavaLibrary.Jlib;
import io.restassured.http.ContentType;
import pojoclassLibrary.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class DataDrivenTest {

	@Test(dataProvider = "getData")
	public void createProjectWithDiffData(String createdBy,String projectName,String status,int teamSize ) {
		//Prerequisites- crate body using pojo and data provider
		ProjectLibrary p=new ProjectLibrary( createdBy,  projectName+Jlib.random(300),  status, teamSize);
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(p).contentType(ContentType.JSON)
        //action
		.when().post("/addProject")
        //validation
		.then().log().all();


	}
	@DataProvider(name="getData")
	public Object[][] data() {
		Object[][] data = new Object[3][4];

		data[0][0]="shri";
		data[0][1]="Dell";
		data[0][2]="completed";
		data[0][3]=12;

		data[1][0]="shrik";
		data[1][1]="Hp";
		data[1][2]="completed";
		data[1][3]=18;

		data[2][0]="shrikanth";
		data[2][1]="lenova";
		data[2][2]="on going";
		data[2][3]=18;
		return data;
	}
	
}

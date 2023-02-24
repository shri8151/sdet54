package serialization_Deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassLibrary.EmployeeObject;

public class serialization {

	@Test
	public void employeeDetails() throws JsonGenerationException, JsonMappingException, IOException {
		
		EmployeeObject emp=new EmployeeObject("shri123", "ty135", "testing", 200000);
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./serial.json"), emp);
		
	}

}

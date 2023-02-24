package serialization_Deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassLibrary.EmployeeObject;


public class Deserialization {
	


		@Test
		public void employeeDetails() throws JsonGenerationException, JsonMappingException, IOException {
			
			ObjectMapper obj= new ObjectMapper();
			EmployeeObject d = obj.readValue(new File("./serial.json"),EmployeeObject.class);
			
			System.out.println(d.getName());
			System.out.println(d.getDept());
			
		}

	}



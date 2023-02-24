package serialization_Deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassLibrary.EmployeeObjectArray;

public class Deserialization_Array {
	
	@Test
	
	public void employeeDetails() throws JsonMappingException, IOException {
		
		ObjectMapper obj=new ObjectMapper();
		EmployeeObjectArray d = obj.readValue(new File("./serialArray.json"),EmployeeObjectArray.class);
		
		System.out.println(d.getName());
		System.out.println(d.getDept());
		System.out.println(d.getSal());
		System.out.println(d.getPhoneNo()[0]);
		System.out.println(d.getPhoneNo()[1]);
		//System.out.println(d.getPhoneNo1());
		
		
		
		
	}

}

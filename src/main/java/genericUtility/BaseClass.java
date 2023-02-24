package genericUtility;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import dbUtility.DataBaseUtility;

public class BaseClass {
	public DataBaseUtility db=new DataBaseUtility();
	
	@BeforeSuite
	public void bsConfig() throws SQLException {
		db.openDBConnection(null, null, null);
		
		
	}
	@AfterSuite
	public void sConfig() throws SQLException {
		db.closeDB();
	}
}
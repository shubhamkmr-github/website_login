package login;
import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

public class test {

	@Test
	public void testcase_1() throws SQLException {
		
		main app = new main(); 
		
		Assert.assertEquals(true, app.logIn("shubham", "1234"));
	}
	
	@Test
	public void testcase_2() throws SQLException{
		
		main app = new main();
		
		Assert.assertEquals(false, app.logIn("false","info"));
	}

}

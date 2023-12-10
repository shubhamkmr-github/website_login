package login;

import java.sql.*;
import java.util.*;
public class main{
	public boolean logIn(String uname, String pass) throws SQLException{
		info ob=new info();
		String username, password;
		
		username = ob.username;
		password = ob.password;
		
		return uname.equals(username) && pass.equals(password);
	}
}

package login;

import java.sql.*;

public class info{
	String username;
	String password;
	Connection con;
	info() throws SQLException {
		con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/login", "root", "tiger");
		
		String query = "select * from login_details";
		
		Statement st = con.createStatement();
		
		ResultSet result = st.executeQuery(query);
		while(result.next()) {
			this.username=result.getString(1);
			this.password=result.getString(2);
		}
		
		con.close();
	}
}
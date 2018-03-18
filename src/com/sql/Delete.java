package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","oracle");
		Statement st=con.createStatement();
		String q="delete from mindq where id=10";
		st.executeUpdate(q);
		con.close();
		

	}

}

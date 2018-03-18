  package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbtesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","oracle");
		Statement st=con.createStatement();
		String q1="create table mindq(id number(3))";
		st.executeUpdate(q1);
		con.close();
		

	}

}

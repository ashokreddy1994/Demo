package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args)throws Exception {
//		load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		connect to the database
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","ashok");
		String q="delete from mindq";
//		for execute the query 
		Statement st=con.createStatement();
		int x=st.executeUpdate(q);
		System.out.println("record succesfully updated:"+x);
		con.close();

	}

}

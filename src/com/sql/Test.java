package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","ashok");
		Statement st=con.createStatement();
		String q1="select count(*) from mindq";
		ResultSet rs=st.executeQuery(q1);
		while(rs.next()){
			System.out.println(rs.getInt(1));
		}
		String q2="update mindq set sal=1000 where id=1";
		int x=st.executeUpdate(q2);
		System.out.println(x);
		String q3="select max(sal) from mindq";
		ResultSet rs2=st.executeQuery(q3);
		while(rs2.next()){
			System.out.println(rs2 .getInt(1));
		}
		String q4="select * from tab";
		ResultSet rs3=st.executeQuery(q4);
		while(rs3.next()){
			System.out.println(rs3 .getString(1));
		}
		con.close();
		

	}

}

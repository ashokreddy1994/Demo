package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Alter {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","ashok");
		Statement st=con.createStatement();
		//String q="alter table mindq add(caste varchar2(10),villege varchar2(10),sal number(7,2),dist varchar2(6))";
		//st.executeUpdate(q);
	//	String q1 ="insert into mindq values(2,'veena','reddy','ppl',490,'guntur')";
	//	st.executeUpdate(q1);
		String q2="select * from mindq";
		ResultSet rs=st.executeQuery(q2);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6) );
		}
		con.close();
		

	}

}

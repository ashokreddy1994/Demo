package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrimaryKey {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","oracle");
		Statement st=con.createStatement();
		//String q="create table ashok(id number(5) primary key,name varchar2(10) not null)";
		
		//st.executeUpdate(q);
		String q1="select * from ashok";
		ResultSet rs=st.executeQuery(q1);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+rs.getString(2));
		}
		String q2="delete from mindq where rowid not in(select max(rowid) from mindq group by caste,dist)";
		st.executeUpdate(q2);
		System.out.println("ashok");
		con.close();
		
	}

}

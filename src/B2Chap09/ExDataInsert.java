package B2Chap09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.io.*;

public class ExDataInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","database");  
			  
			//step3 create the statement object  
			PreparedStatement pstmt=con.prepareStatement("insert into emp4 values(?,?,?)");  
			  
			//step4 execute query  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String temp;
			int eno;
			String ename;
			String city;
			
			System.out.println("Enter the eno:");
			temp=br.readLine();
			eno=Integer.parseInt(temp);
			System.out.println("Enter the ename:");
			ename=br.readLine();
			System.out.println("Enter the city:");
			city=br.readLine();
			
			pstmt.setInt(1,eno);
			pstmt.setString(2,ename);
			pstmt.setString(3,city);
			pstmt.execute();
			System.out.println("Records inserted");
		}
		catch(Exception e)
		{ System.out.println(e);}  
	}
}

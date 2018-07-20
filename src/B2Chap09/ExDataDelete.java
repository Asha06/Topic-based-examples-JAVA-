package B2Chap09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;

public class ExDataDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","database");  
			  
			//step3 create the statement object  
			PreparedStatement pstmt=con.prepareStatement("Delete from emp4 where eno=?");  
			  
			//step4 execute query  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String temp;
			int eno;
			
			System.out.println("Enter the eno to be deleted:");
			temp=br.readLine();
			eno=Integer.parseInt(temp);
			
			pstmt.setInt(1, eno);
			pstmt.execute();
			System.out.println("Records deleted");
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e)
			{ System.out.println(e);}  
	}

}

package Chap6;
import java.io.*;
public class exExcptnHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int a=10,b=0,div=a/b;
		System.out.println("Division is:"+div);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception:" +e);
		}
		System.out.println("This is after exception");
	}

}

package Chap6;
import java.io.*;
public class exExcptnHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,20,30,40,50};
		try{
		System.out.println(+a[6]);
		}
		finally{
		System.out.println("This is after exception");
		}
	}
}

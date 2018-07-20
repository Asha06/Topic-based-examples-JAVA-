package Chap3;
import java.util.Scanner;
public class ExWhil3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,i=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n value");
		n=in.nextInt();
		System.out.println("Enter m value");
		m=in.nextInt();
		while(i<=m)
		{
			System.out.println(i+"X"+n+"="+(i*n));
			i++;
		}
	}

}

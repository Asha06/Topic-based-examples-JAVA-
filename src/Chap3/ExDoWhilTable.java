package Chap3;
//Tables is printed depending on n value & m(end value)
import java.util.Scanner;

public class ExDoWhilTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,i=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n value");
		n=in.nextInt();
		System.out.println("Enter m value");
		m=in.nextInt();
		do
		{
			System.out.println(i+"X"+n+"="+(i*n));
			i++;
		}while(i<=m);

	}

}

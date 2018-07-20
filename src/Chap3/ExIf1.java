package Chap3;
import java.util.Scanner;

public class ExIf1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Num is even");
		}
		else
		{
			System.out.println("Num is odd");
		}
	}
}

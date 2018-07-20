package Chap3;
import java.util.Scanner;
public class ExWhil1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,a,temp;;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=in.nextInt();
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			sum=sum+(a*a*a);
		}
		if(sum==temp)
		System.out.println("Armstrong num");
		else
			System.out.println("Not an Armstrong num");
	}

}

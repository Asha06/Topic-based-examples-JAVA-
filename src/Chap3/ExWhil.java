package Chap3;
import java.util.Scanner;
public class ExWhil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,fact=1,n;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the n value:");
	n=in.nextInt();
	while(i<=n)
	{
		fact=fact*i;
		i++;
	}
	System.out.println("Factorial="+fact);
	}

}

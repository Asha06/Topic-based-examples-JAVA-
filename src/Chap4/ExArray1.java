package Chap4;
import java.util.Scanner;
public class ExArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] a=new int[5];
		int i;
		System.out.println("Enter the 5 array elements");
		for(i=0;i<5;i++)
		{
			a[i]=in.nextInt();
		}	
		System.out.println("The 5 array elements are");
		for(i=0;i<5;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	
	}
}

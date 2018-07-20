package Chap4;

import java.util.Scanner;
//??
public class ExArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[][] a=new int[3][3];
		int i,j;
		System.out.println("Enter the 3 array elements");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			a[i][j]=in.nextInt();
			}
		}	
		System.out.println("The 3 array elements are");
		for(i=0;i<5;i++)
		{
			for(j=0;j<3;j++)
			{
			System.out.println("a["+i+"]["+j+"]="+a[i][j]);
			}
		}
	}

}

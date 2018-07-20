package Chap4;
import java.util.Scanner;
public class ExArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		int i,j;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the 9 a array elements:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		System.out.println("Enter the 9 b array elements");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=in.nextInt();
			}
		}
		System.out.println("The a array elements are");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("\t"+a[i][j]);
			}
		}
		System.out.println("The b array elements are");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("\t"+b[i][j]);
			}
		}
		System.out.println("The resultant array is:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print("\t"+c[i][j]);
			}
			System.out.println();
		}
	}

}

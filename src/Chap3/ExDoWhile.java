package Chap3;
import java.util.Scanner;
//Sum of n numbers
public class ExDoWhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        x = sc.nextInt();
        do
        {
            sum = sum +i;
            i++;
        }while(i<=x);
        System.out.println("Sum of "+x+" numbers is :"+sum);
	}
}

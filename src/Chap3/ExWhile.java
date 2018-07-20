package Chap3;
import java.util.Scanner;
public class ExWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        x = sc.nextInt();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
	}

}

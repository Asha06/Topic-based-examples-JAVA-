package Chap3;
import java.util.Scanner;

public class ExIfElse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m1,m2,m3;
		float Total,Avg;
		System.out.println("Enter Mark1:");
		m1=in.nextInt();
		System.out.println("Enter Mark2:");
		m2=in.nextInt();
		System.out.println("Enter Mark3:");
		m3=in.nextInt();
		Total=m1+m2+m3;
		System.out.println("Total Marks:"+Total);
		Avg=Total/3;
		System.out.println("Average;"+Avg);
		if(m1>=50 && m2>=50 && m3>=50)
		{
			
		if(Avg>=80 && Avg<100)
		{
			System.out.println("Distinction");
		}
		else if(Avg<80 && Avg>=60)
		{
			System.out.println("First Class");
		}
		else if(Avg>=50)
		{
			System.out.println("Second Class");
		}
		}
		
		else
			
			System.out.println("Fail");
	}
}

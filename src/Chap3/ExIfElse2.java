package Chap3;
import java.util.Scanner;

public class ExIfElse2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int basic,hra,da,pf;
		float netsal;
		System.out.println("Enter the salary");
		basic=sc.nextInt();
		if(basic>=20000 && basic<100000)
		{
			hra=basic*20/100;
			da=basic*20/100;
			pf=basic*5/100;
			System.out.println("hra="+hra);
			System.out.println("da="+da);
			System.out.println("pf="+pf);
			netsal=basic+hra+da-pf;
			System.out.println("Net Salary="+netsal);
		}
		else if(basic>10000 && basic<20000)
		{
			hra=basic*15/100;
			da=basic*15/100;
			pf=basic*10/100;
			System.out.println("hra="+hra);
			System.out.println("da="+da);
			System.out.println("pf="+pf);
			netsal=basic+hra+da-pf;
			System.out.println("Net Salary="+netsal);
			
		}
		else if(basic<10000)
		{
			hra=basic*10/100;
			da=basic*10/100;
			pf=basic*5/100;
			System.out.println("hra="+hra);
			System.out.println("da="+da);
			System.out.println("pf="+pf);
			netsal=basic+hra+da-pf;
			System.out.println("Net Salary="+netsal);
		}
		else
		{
			System.out.println("Invalid ");
		}
	}
}

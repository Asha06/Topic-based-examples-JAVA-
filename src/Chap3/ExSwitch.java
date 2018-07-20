package Chap3;
import java.util.Scanner;
public class ExSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a,b,sum,sub,mul,div,ch;
		System.out.println(("Enter a & b values:"));
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("Enter ur chice:");
	  System.out.println("1Sum\n 2Sub\n  3Mult\n  4Div");
	  ch=in.nextInt();
		switch(ch)
		{
		case 1:sum=a+b;
			System.out.println("Sum:"+sum);
			break;
		case 2:sub=a-b;
			System.out.println("Sub:"+sub);
			break;
		case 3:mul=a*b;
			System.out.println("Mult:"+mul);
			break;
		case 4:div=a/b;
			System.out.println("Div:"+div);
			break;
		default: System.out.println("Invalid");
			   break;
		}
	}

}

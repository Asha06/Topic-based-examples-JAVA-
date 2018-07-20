package Chap3;

import java.util.Scanner;

public class ExIfElse1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int consumed,pay;
		System.out.println("Enter the amount Electricity Consumed");
		consumed=in.nextInt();
		if(consumed>=50 && consumed<=100)
		{
			pay=consumed*30;
			System.out.println("Pay:"+pay);
		}
		else if(consumed>=30 && consumed<50)
		{
			pay=consumed*25;
			System.out.println("Pay:"+pay);
		}
		else
		{
			pay=consumed*10;
			System.out.println("Pay:"+pay);
		}
	}
}

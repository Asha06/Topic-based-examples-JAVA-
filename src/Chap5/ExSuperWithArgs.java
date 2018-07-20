package Chap5;

class Ex1
{
	Ex1(int x)
	{
		System.out.println("This is the default Constructor of Ex Class");
		System.out.println(+x);
	}
}
public class ExSuperWithArgs extends Ex1{
	ExSuperWithArgs(int x,int y) //Derived Class Constructor
	{
		super(x);
		System.out.println(+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExSuperWithArgs obj=new ExSuperWithArgs(10,100);	
	}

}

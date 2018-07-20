package Chap5;

public class ExConstrctrOverloading {
	ExConstrctrOverloading()
	{
		System.out.println("This is inside constructor1");
	}
	ExConstrctrOverloading(int a)
	{
		System.out.println("This is inside constructor2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExConstrctrOverloading obj=new ExConstrctrOverloading();
		ExConstrctrOverloading obj1=new ExConstrctrOverloading(20);
	}

}

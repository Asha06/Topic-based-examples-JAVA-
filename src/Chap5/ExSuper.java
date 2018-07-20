package Chap5;

class Ex //Base class
{
	Ex()
	{	//Base class Constructor
		System.out.println("This is the default Constructor of Ex Class");
	}
}
public class ExSuper extends Ex{
	ExSuper() //Derived Class Constructor
	{
		super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExSuper obj=new ExSuper();
	}

}

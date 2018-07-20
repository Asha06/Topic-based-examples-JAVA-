package Chap1;

public class ExMain {
	void main(String str,int x)
	{
		System.out.println("This is insnide main");
		System.out.println(str);
		System.out.println("x="+x);
	}
	void main(int a)
	{
		System.out.println("a="+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExMain obj=new ExMain();
		obj.main("Arun",100);
		obj.main(1000);
	}

}

package Chap5;
public class ExOverloading {
	void get()
	{
		System.out.println("This is inside get method");
	}
	void get(int a)
	{
		System.out.println("a="+a);
	}
	void get(int a,int b)
	{
		int add=a+b;
		System.out.println("Addition is:"+add);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExOverloading obj=new ExOverloading();
		obj.get();
		obj.get(100);
		obj.get(10,20);
	}

}

package Chap5;

abstract public class Exab {
void get()
{
	System.out.println("Normal get method");	
}
abstract void put();



public static void main(String[] args)
{
	Exab obj=new Exab();	
}
	
}

package B2Chap05;
import java.io.*;
//Extending Thread Class
public class ExThread extends Thread//i.e Main Class
{
	ExThread()
	{
		super.start();
	}
	public void run()//Run method is compulsory
	{
		int i;
		try{
			for(i=1;i<=10;i++)
			{
				System.out.println("Child thread:"+i);
				Thread.sleep(500);
			}
			System.out.println("Child thread exiting");
		}catch(InterruptedException e)
		{
			System.out.println("Exception :"+e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExThread();//Invoking ExThread Class
		try{
			int i=1;
			for(i=1;i<=10;i++)
			{
				System.out.println("Main thread:"+i);
				Thread.sleep(1000);
			}
			System.out.println("Main thread exiting");
		}catch(InterruptedException e)
		{
			System.out.println("Exception :"+e);
		}
	}
}
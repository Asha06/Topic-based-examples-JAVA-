package B2Chap05;
import java.io.*;
//Implementing Runnable Interface
class ExThread1 implements Runnable{
	Thread t;
	ExThread1()
	{
		t=new Thread(this,"MyThread");
		t.start();
	}
	public void run()
	{
		int i;
		try{
			for(i=1;i<=10;i++)
			{
				System.out.println("Child thread:"+i);
				Thread.sleep(500);
			}System.out.println("Child thread Exiting");
		}catch(InterruptedException e)
		{
			System.out.println("Exception:"+e);
		}
		
	}
}
public class ExRunImplementation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExThread1 t=new ExThread1();
		try{
			int i;
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
